package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PC {

    private Case theCase;

    private Monitor monitor;

    private Motherboard motherboard;

    @Autowired//After spring 4.3 it is done implicitly
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}