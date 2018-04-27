package com.example.designpattern.Q_Observer.example1.clazz;

import com.example.designpattern.Q_Observer.example1.interfaces.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers=new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer next = iterator.next();
            next.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
