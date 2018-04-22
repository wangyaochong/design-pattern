package com.example.designpattern.C_TemplateMethod.example1.clazz;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string) {
        this.string = string;
        this.width=string.getBytes().length;
    }
    private void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        printLine();
    }
}
