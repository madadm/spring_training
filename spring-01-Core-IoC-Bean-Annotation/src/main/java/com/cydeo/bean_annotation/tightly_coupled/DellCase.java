package com.cydeo.bean_annotation.tightly_coupled;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DellCase {

    private String model;
    private String manufacturer;
    private String powerSupply;

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }


}
