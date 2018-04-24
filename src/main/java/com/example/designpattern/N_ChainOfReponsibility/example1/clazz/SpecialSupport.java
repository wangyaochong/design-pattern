package com.example.designpattern.N_ChainOfReponsibility.example1.clazz;

public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport(String name,int number) {
        super(name);
        this.number=number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()==number){
            return true;
        }
        return false;
    }
}