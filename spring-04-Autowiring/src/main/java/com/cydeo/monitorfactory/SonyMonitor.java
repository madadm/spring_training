package com.cydeo.monitorfactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SonyMonitor extends Monitor {

    public SonyMonitor() {
        super("25 inch Beast", "Sony", 25);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
