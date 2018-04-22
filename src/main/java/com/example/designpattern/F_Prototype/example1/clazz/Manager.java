package com.example.designpattern.F_Prototype.example1.clazz;

import com.example.designpattern.F_Prototype.example1.interfaces.Product;

import java.util.HashMap;

public class Manager {
    private HashMap<String,Product> showCase =new HashMap();
    public void register(String name, Product product){
        showCase.put(name,product);
    }
    public Product create(String protoName){
        Product p=showCase.get(protoName);
        return p.createClone();
    }
}
