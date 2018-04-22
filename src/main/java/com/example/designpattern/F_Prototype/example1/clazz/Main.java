package com.example.designpattern.F_Prototype.example1.clazz;

import com.example.designpattern.F_Prototype.example1.clazz.product.BoxPen;
import com.example.designpattern.F_Prototype.example1.clazz.product.UnderlinePen;
import com.example.designpattern.F_Prototype.example1.interfaces.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        UnderlinePen uPen=new UnderlinePen('~');
        BoxPen starBox=new BoxPen('*');
        BoxPen slashBox=new BoxPen('/');
        manager.register("strong message",uPen);
        manager.register("warning box",starBox);
        manager.register("slash box",slashBox);

        Product p1=manager.create("strong message");
        p1.use("hello,world");

        Product p2=manager.create("warning box");
        p2.use("hello,world");

        Product p3=manager.create("slash box");
        p3.use("hello,world");



    }
}
