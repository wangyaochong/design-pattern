package com.example.designpattern.L_Decorator.example1;

import com.example.designpattern.L_Decorator.example1.clazz.Display;
import com.example.designpattern.L_Decorator.example1.clazz.FullBorder;
import com.example.designpattern.L_Decorator.example1.clazz.SideBorder;
import com.example.designpattern.L_Decorator.example1.clazz.StringDisplay;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Display b1=new StringDisplay("hello,world.");
        Display b2=new SideBorder(b1,'#');
        Display b3=new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4=new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("hello,world!")),'*'))),'/');
        b4.show();
    }
}
