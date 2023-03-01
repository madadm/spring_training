package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class CarController {

    @RequestMapping("car-info")
    public String getCarInfo(@RequestParam String make, Model model) {

        model.addAttribute("make", make);
        return "car/car-info";

    }

    @RequestMapping("car-info2")
    public String getCarInfo2(@RequestParam(value = "make", required = false, defaultValue = "KIA") String car, Model model) {

        model.addAttribute("make", car);
        return "car/car-info";

    }

    @RequestMapping("car-info3")
    public String getCarInfo2(@RequestParam String car, @RequestParam String year, Model model) {

        model.addAttribute("make", car);
        model.addAttribute("year", year);
        return "car/car-info";

    }


    @RequestMapping("/info/{make}/{year}")
    public String getInfo(@PathVariable String make, @PathVariable String year, Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

}