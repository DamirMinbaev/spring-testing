package ru.mir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final TextService textService;

    private final CalculationService calculationService;

    @Autowired
    public MainService(TextService textService,CalculationService calculationService){
        this.textService = textService;
        this.calculationService = calculationService;
    }

    public String calculateAndFormat(String format, Integer a,Integer b){
        Integer sum = calculationService.sum(a, b);
        return textService.format(format,sum);
    }




}
