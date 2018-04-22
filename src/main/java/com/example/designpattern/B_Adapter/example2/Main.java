package com.example.designpattern.B_Adapter.example2;

import com.example.designpattern.B_Adapter.example2.clazz.PrintBanner;
import com.example.designpattern.B_Adapter.example2.clazz.Print;
public class Main {
    public static void main(String[] args) {
        Print p=new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
