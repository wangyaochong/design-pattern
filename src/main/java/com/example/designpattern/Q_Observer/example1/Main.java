package com.example.designpattern.Q_Observer.example1;

import com.example.designpattern.Q_Observer.example1.clazz.DigitObserver;
import com.example.designpattern.Q_Observer.example1.clazz.GraphObserver;
import com.example.designpattern.Q_Observer.example1.clazz.NumberGenerator;
import com.example.designpattern.Q_Observer.example1.clazz.RandomNumberGenerator;
import com.example.designpattern.Q_Observer.example1.interfaces.Observer;

import java.util.Observable;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator=new RandomNumberGenerator();
        Observer o1=new DigitObserver();
        Observer o2=new GraphObserver();
        numberGenerator.addObserver(o1);
        numberGenerator.addObserver(o2);
        numberGenerator.execute();
    }
}
