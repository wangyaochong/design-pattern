package com.example.designpattern.J_Strategy.example1.clazz;

public class Hand {
    public static final int HANDVALUE_GUU=0;
    public static final int HANDVALUE_CHO=1;
    public static final int HANDVALUD_PAA=2;
    public static final Hand[] hand={
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUD_PAA)
    };
    private static final String[]name={"石头","剪刀","布"};
    private int handValue;
    private Hand(int handValue){
        this.handValue=handValue;
    }
    public static Hand getHand(int handValue){
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h){
        return fight(h)==1;
    }
    private int fight(Hand h){
        if(this==h){
            return 0;
        }else if((this.handValue+1)%3==h.handValue){
            return 1;
        }else {
            return -1;
        }
    }
}
