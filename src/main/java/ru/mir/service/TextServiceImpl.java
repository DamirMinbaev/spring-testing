package ru.mir.service;

import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService{

    @Override
    public String format(String format, Object arg) {
        return String.format(format,arg);
    }
}
