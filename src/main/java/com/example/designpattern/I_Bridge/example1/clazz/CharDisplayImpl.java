package com.example.designpattern.I_Bridge.example1.clazz;

public class CharDisplayImpl extends DisplayImpl {
    private char start;
    private char content;
    private char end;
    public CharDisplayImpl(char start,char content,char end){
        this.start=start;
        this.content=content;
        this.end=end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(content);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
