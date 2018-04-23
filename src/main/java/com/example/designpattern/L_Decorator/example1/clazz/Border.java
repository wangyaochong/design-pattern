package com.example.designpattern.L_Decorator.example1.clazz;

public class Border extends Display {
    protected Display display;
    protected Border(Display display){
        this.display=display;
    }
    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }
}
