package com.example.designpattern.R_Memento.example1;

import com.example.designpattern.R_Memento.example1.clazz.Gamer;
import com.example.designpattern.R_Memento.example1.clazz.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer(100);
        Memento memento=gamer.createMemento();
        for(int i=0;i<100;i++){
            System.out.println("===="+i);
            System.out.println("当前状态："+gamer);
            gamer.bet();
            System.out.println("所持金钱为："+gamer.getMoney());
            if(gamer.getMoney()>memento.getMoney()){
                System.out.println("金钱增加了，记录状态");;
                memento=gamer.createMemento();
            }else if(gamer.getMoney()<memento.getMoney()/2){
                System.out.println("金钱减少，恢复以前状态");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
