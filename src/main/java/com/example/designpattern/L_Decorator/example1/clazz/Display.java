package com.example.designpattern.L_Decorator.example1.clazz;

public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract  String getRowText(int row);
    public final void show(){
        for(int i=0;i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }
}
