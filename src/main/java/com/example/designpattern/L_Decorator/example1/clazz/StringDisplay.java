package com.example.designpattern.L_Decorator.example1.clazz;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;

public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string){
        this.string=string;
    }
    @Override
    public int getColumns(){
        return string.length();
    }


    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0) {
            return string;
        }else{
            return null;
        }
    }
}
