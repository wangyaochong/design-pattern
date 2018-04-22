package com.example.designpattern.H_AbstractFactory.example1.clazz.factory;

public abstract class Item {
    protected String caption;
    public Item (String caption){
        this.caption=caption;
    }
    public abstract String makeHtml();
}
