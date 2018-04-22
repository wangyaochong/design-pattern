package com.example.designpattern.D_FactoryMethod.example1.clazz.framework;

public abstract class Factory {
    public final Product create(String owner){
        Product p=createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
