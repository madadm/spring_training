package com.cydeo.bean_annotation.loosely_coupled;


import com.cydeo.bean_annotation.config.ComputerConfiguration;
import com.cydeo.bean_annotation.config.RandomConfiguration;
import com.cydeo.bean_annotation.loosely_coupled.PC;
import com.cydeo.bean_annotation.loosely_coupled.casefactory.Case;
import com.cydeo.bean_annotation.loosely_coupled.casefactory.DellCase;
import com.cydeo.bean_annotation.loosely_coupled.monitorfactory.Monitor;
import com.cydeo.bean_annotation.loosely_coupled.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.loosely_coupled.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.loosely_coupled.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerTest {


    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfiguration.class, RandomConfiguration.class);


        SonyMonitor theMonitor = container.getBean(SonyMonitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherborad = container.getBean(Motherboard.class);

        PC myPC = new PC( theCase, theMonitor,theMotherborad);

        myPC.powerUp();

        Monitor sonyMonitor = container.getBean("sony", Monitor.class);// given name sony to sony monitor bean
        Case theCase1 = container.getBean(Case.class);
        Motherboard theMotherborad1 = container.getBean(Motherboard.class);

        PC myPc1 = new PC(theCase1, sonyMonitor, theMotherborad1);

        Monitor theMonitor2 = container.getBean( Monitor.class);// given @Primary annotation to the bean
        Case theCase2 = container.getBean(Case.class);
        Motherboard theMotherborad2 = container.getBean(Motherboard.class);

        PC myPc2 = new PC(theCase2, theMonitor2, theMotherborad2);

    }
}
