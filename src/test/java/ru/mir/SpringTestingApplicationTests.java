package ru.mir;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.mir.service.MainService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestingApplicationTests {

    @Autowired
	private MainService mainService;

	@Test
	public void mainServiceTest() {
        String s = mainService.calculateAndFormat("%s", 2, 3);
        Assert.assertEquals("5",s);
    }

}
