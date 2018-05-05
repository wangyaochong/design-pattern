package com.example.designpattern.U_Proxy.example1;

import com.example.designpattern.U_Proxy.example1.clazz.PrintProxy;
import com.example.designpattern.U_Proxy.example1.interfaces.Printable;

public class Main {
    public static void main(String[] args) {
        Printable p=new PrintProxy("alice");
        System.out.println("name=" +p.getPrinterName());
        p.setPrinterName("bob");
        System.out.println("name="+p.getPrinterName());
        p.print("hello,world");
    }
}
