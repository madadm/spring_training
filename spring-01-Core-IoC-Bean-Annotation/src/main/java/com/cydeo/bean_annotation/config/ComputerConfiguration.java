package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.loosely_coupled.casefactory.Case;
import com.cydeo.bean_annotation.loosely_coupled.casefactory.DellCase;
import com.cydeo.bean_annotation.loosely_coupled.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.bean_annotation.loosely_coupled.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.loosely_coupled.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfiguration {

    @Bean(name="sony")
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch Beast", "Sony", 25);
    }

    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast", "Acer", 23);
    }
    @Bean
    public Case dellCase(){
        return new DellCase("220B", "Dell", "240");
    }
    @Bean
    public Motherboard asusMotherBoard(){
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "8");
    }

}
