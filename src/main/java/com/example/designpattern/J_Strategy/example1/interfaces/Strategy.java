package com.example.designpattern.J_Strategy.example1.interfaces;

import com.example.designpattern.J_Strategy.example1.clazz.Hand;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
