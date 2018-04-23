package com.example.designpattern.L_Decorator.example1.clazz;

public class SideBorder extends Border {
    private char borderChar;
    public  SideBorder(Display display,char ch) {
        super(display);
        this.borderChar=ch;
    }
    public int getColumns(){
        return 1+display.getColumns()+1;
    }
    public int getRows(){
        return display.getRows();
    }
    public String getRowText(int row){
        return borderChar+display.getRowText(row)+borderChar;
    }
}
