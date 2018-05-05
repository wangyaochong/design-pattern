package com.example.designpattern.U_Proxy.example1.clazz;

import com.example.designpattern.U_Proxy.example1.interfaces.Printable;

public class Printer implements Printable{
    private String name;
    public Printer(String name){
        this.name=name;
        heavyJob("正在生成printer实例("+name+")");
    }
    @Override
    public void setPrinterName(String name) {
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== "+name+" ===");
        System.out.println(string);
    }
    private void heavyJob(String string){
        System.out.println(string);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("初始化重任结束");
    }

}
