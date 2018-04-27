package com.example.designpattern.R_Memento.example1.clazz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private Random random=new Random();
    private List<String> fruits=new ArrayList<>();
    private static String[] fruitsName={"苹果","葡萄","香蕉","橘子"};
    public Gamer(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }
    public void bet(){
        int dice=random.nextInt(6)+1;
        if(dice==1){
            money+=100;
        }else if(dice==2){
            money/=2;
        }else if(dice==6){
            String f=getFruit();
            fruits.add(f);
        }else{

        }
    }
    public Memento createMemento(){
        Memento m=new Memento(money);
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("好吃的")){
                m.addFruits(next);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento){
        this.money=memento.money;
        this.fruits=memento.getFruits();
    }
    public String toString(){
        return "[money="+money+", fruits="+fruits+"]";
    }
    private String getFruit(){
        String prefix="";
        if(random.nextBoolean()){
            prefix="好吃的";
        }
        return prefix+fruitsName[random.nextInt(fruitsName.length)];
    }
}
