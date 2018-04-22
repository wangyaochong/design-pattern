package com.example.designpattern.B_Adapter.example1;

import com.example.designpattern.B_Adapter.example1.clazz.PrintBanner;
import com.example.designpattern.B_Adapter.example1.interfaces.Print;

public class Main {
    public static void main(String[] args) {
        Print p=new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
