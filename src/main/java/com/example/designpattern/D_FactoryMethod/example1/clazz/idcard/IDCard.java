package com.example.designpattern.D_FactoryMethod.example1.clazz.idcard;

import com.example.designpattern.D_FactoryMethod.example1.clazz.framework.Product;

public class IDCard extends Product{
    private String owner;
    IDCard(String owner){
        System.out.println("制作"+owner+"的ID卡。");
        this.owner=owner;
    }
    public void use(){
        System.out.println("使用"+owner+"的ID卡。");
    }
    public String getOwner(){
        return owner;
    }
}
