package com.example.designpattern.I_Bridge.example1;

import com.example.designpattern.I_Bridge.example1.clazz.*;

public class Main {
    public static void main(String[] args) {
        Display d1=new Display(new StringDisplayImpl("hello,china"));
        Display d2=new CountDisplay((new StringDisplayImpl("hello,world")));
        CountDisplay d3=new CountDisplay(new StringDisplayImpl("hello, universe"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);


        IncreaseDisplay d4=new IncreaseDisplay(new CharDisplayImpl('<','*','>'),1);
        d4.increaseDisplay(4);
        IncreaseDisplay d5=new IncreaseDisplay(new CharDisplayImpl('<','#','-'),2);
        d5.increaseDisplay(4);
        Display d6=new IncreaseDisplay(new CharDisplayImpl('<','#','-'),2);
        Display d7=new Display(new StringDisplayImpl("#"));
        d6.display();
        d7.display();
    }
}
