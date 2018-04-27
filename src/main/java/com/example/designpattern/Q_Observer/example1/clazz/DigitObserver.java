package com.example.designpattern.Q_Observer.example1.clazz;

import com.example.designpattern.Q_Observer.example1.interfaces.Observer;

public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("digitObserver:"+numberGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
