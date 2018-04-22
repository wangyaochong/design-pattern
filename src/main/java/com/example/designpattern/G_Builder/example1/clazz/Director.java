package com.example.designpattern.G_Builder.example1.clazz;

import com.example.designpattern.G_Builder.example1.interfaces.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public void construct(){
        builder.makeTitle("greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{"早上好","下午好"});
        builder.makeString("晚上");;
        builder.makeItems(new String[]{"晚上好","晚安","再见"});
        builder.close();
    }

}
