package com.example.designpattern.D_FactoryMethod.example1.clazz.idcard;

import com.example.designpattern.D_FactoryMethod.example1.clazz.framework.Factory;
import com.example.designpattern.D_FactoryMethod.example1.clazz.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners=new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(product.getOwner());
    }
}
