package com.example.designpattern.E_Singleton.example1.clazz;

public class Singleton {
    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}