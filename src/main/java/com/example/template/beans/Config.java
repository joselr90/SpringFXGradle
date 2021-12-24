package com.example.template.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean("lblTitulo")
    private String getTitulo(){
        return "AWWW YESSSS";
    }
    @Bean("textField")
    private String getTextField(){
        return "TextField";
    }
}
