package com.cydeo.casefactory;

import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case {


    public DellCase() {
        super("220B", "Dell", "240");
    }

    @Override
    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
