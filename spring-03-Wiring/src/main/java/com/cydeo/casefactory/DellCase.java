package com.cydeo.casefactory;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        super(model, manufacturer, powerSupply, dimensions);
    }

    @Override
    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
