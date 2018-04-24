package com.example.designpattern.P_Mediator.example1.clazz;

import com.example.designpattern.P_Mediator.example1.interfaces.Colleague;
import com.example.designpattern.P_Mediator.example1.interfaces.Mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption){
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
