package com.example.designpattern.N_ChainOfReponsibility.example1.clazz;

public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()%2==1){
            return true;
        }
        return false;
    }
}
