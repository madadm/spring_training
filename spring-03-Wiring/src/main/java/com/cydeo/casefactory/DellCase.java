package com.cydeo.casefactory;

import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case {


//    public DellCase() {
//        super("220B", "Dell", "240", new Dimensions(8,8,8));
//    }

    public DellCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        super(model, manufacturer, powerSupply, dimensions);
    }

    @Override
    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
