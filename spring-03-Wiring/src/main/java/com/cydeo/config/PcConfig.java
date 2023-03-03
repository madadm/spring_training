package com.cydeo.config;


import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.cydeo")
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return  new Dimensions(50,10,10);
    }


    public Dimensions dimensions1(){
        return  new Dimensions(50,10,10);
    }

    @Bean
    public Case dellCase(Dimensions dimensions){
        return new DellCase("220B", "Dell", "240",dimensions1());
    }
}
