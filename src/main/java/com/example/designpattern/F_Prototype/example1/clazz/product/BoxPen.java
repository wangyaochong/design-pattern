package com.example.designpattern.F_Prototype.example1.clazz.product;

import com.example.designpattern.F_Prototype.example1.interfaces.Product;

public class BoxPen extends Product {
    private char decoChar;

    public BoxPen(char decoChar){
        this.decoChar=decoChar;
    }

    @Override
    public void use(String s) {
        int length=s.getBytes().length;
        for(int i=0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar+" "+s+" "+decoChar);
        for(int i=0;i<length+4;i++){
            System.out.print(decoChar);
        }
        System.out.println();
    }

}
