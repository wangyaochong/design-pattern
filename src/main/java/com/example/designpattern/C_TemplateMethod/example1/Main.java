package com.example.designpattern.C_TemplateMethod.example1;

import com.example.designpattern.C_TemplateMethod.example1.clazz.AbstractDisplay;
import com.example.designpattern.C_TemplateMethod.example1.clazz.CharDisplay;
import com.example.designpattern.C_TemplateMethod.example1.clazz.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1=new CharDisplay('W');
        AbstractDisplay d2=new StringDisplay("hello world");
        d1.display();
        d2.display();
    }
}
