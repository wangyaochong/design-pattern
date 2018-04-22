package com.example.designpattern.B_Adapter.example1.clazz;

public class Banner {
    private String string;
    public Banner(String string){
        this.string=string;
    }
    public void showWithParen(){
        System.out.println("{"+string+"}");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
