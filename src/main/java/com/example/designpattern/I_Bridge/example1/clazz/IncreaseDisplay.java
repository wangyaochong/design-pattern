package com.example.designpattern.I_Bridge.example1.clazz;

public class IncreaseDisplay extends CountDisplay{
    int step=0;
    public IncreaseDisplay(DisplayImpl impl,int step) {
        super(impl);
        this.step=step;
    }

    public void increaseDisplay(int level){
        for(int i=0;i<level;i++){
            multiDisplay(i*step);
            System.out.println();
        }
    }

}
