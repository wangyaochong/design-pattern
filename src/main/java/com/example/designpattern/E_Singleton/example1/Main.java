package com.example.designpattern.E_Singleton.example1;

import com.example.designpattern.E_Singleton.example1.clazz.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("start.");
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
        System.out.println("end.");
    }
}
