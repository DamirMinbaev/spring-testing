package ru.mir.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public Integer sum(Integer a,Integer b){
        if(a==null || b==null){
            throw new IllegalArgumentException("Null param!");
        }
        return a+b;
    }
}
