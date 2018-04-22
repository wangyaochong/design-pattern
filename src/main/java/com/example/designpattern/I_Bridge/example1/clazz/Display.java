package com.example.designpattern.I_Bridge.example1.clazz;

public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl=impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
