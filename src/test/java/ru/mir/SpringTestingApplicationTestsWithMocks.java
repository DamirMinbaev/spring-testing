package ru.mir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import ru.mir.service.MainService;
import ru.mir.service.TextService;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class) //same result
//@RunWith(MockitoJUnitRunner.class) //calculation service is null
@SpringBootTest
public class SpringTestingApplicationTestsWithMocks {

    @Autowired
    @InjectMocks
    private MainService mainService;

    @Mock
    private TextService textService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mainServiceTest() {

        String mockServiceResult = "mocked string";
        Mockito.when(textService.format(Mockito.anyString(),Mockito.any()))
                .thenReturn(mockServiceResult);

        String s = mainService.calculateAndFormat("%s", 1, 2);
        Assert.assertEquals(mockServiceResult,s);
    }

}