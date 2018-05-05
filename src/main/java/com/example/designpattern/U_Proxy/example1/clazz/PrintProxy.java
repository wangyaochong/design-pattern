package com.example.designpattern.U_Proxy.example1.clazz;

import com.example.designpattern.U_Proxy.example1.interfaces.Printable;

public class PrintProxy implements Printable {
    private String name;
    private Printer real;
    public PrintProxy(String name){
        this.name=name;
    }
    @Override
    public void setPrinterName(String name) {
        if(real!=null){
            real.setPrinterName(name);
        }
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }
    private synchronized void realize(){
        if(real==null){
            real=new Printer(name);
        }
    }
}
