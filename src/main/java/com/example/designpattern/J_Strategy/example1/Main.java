package com.example.designpattern.J_Strategy.example1;

import com.example.designpattern.J_Strategy.example1.clazz.Hand;
import com.example.designpattern.J_Strategy.example1.clazz.Player;
import com.example.designpattern.J_Strategy.example1.clazz.ProbStrategy;
import com.example.designpattern.J_Strategy.example1.clazz.WinningStrategy;

public class Main {
    public static void main(String[] args) {
        Player p1=new Player("A",new WinningStrategy());
        Player p2=new Player("B",new ProbStrategy());
        for(int i=0;i<10000;i++){
            Hand h1=p1.nextHand();
            Hand h2=p2.nextHand();
            if(h1.isStrongerThan(h2)){
                p1.win();
                p2.lose();
            }else if(h2.isStrongerThan(h1)){
                p2.win();
                p1.lose();
            }else{
                p1.even();
                p2.even();
            }
        }
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
