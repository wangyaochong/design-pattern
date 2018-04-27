package com.example.designpattern.R_Memento.example1.clazz;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList<String> fruits;
    public int getMoney(){
        return money;
    }
    Memento(int money){
        this.money=money;
        this.fruits=new ArrayList<>();
    }
    void addFruits(String fruit){
        fruits.add(fruit);
    }
    List getFruits(){
        return fruits;
    }
}
