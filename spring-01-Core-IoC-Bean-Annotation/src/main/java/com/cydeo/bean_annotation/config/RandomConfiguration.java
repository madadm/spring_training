package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfiguration {

    @Bean
    public String myString(){
        return "Alex";
    }
    @Bean
    public int myInt(){
        return 100;
    }
}
