package com.example.designpattern.J_Strategy.example1.clazz;

import com.example.designpattern.J_Strategy.example1.interfaces.Strategy;

import java.util.Random;

public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won=false;
    private Hand preHand;
    public WinningStrategy(){
        random=new Random(System.currentTimeMillis());
    }

    @Override
    public Hand nextHand() {
        if(!won){
            preHand=Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won=win;
    }
}
