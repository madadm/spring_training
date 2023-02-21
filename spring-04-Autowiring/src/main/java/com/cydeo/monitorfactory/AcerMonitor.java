package com.cydeo.monitorfactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
@Primary
public class AcerMonitor extends Monitor {

    public AcerMonitor() {
        super("23 inch Beast", "Acer", 23);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }


}
