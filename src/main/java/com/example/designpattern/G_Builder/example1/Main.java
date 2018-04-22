package com.example.designpattern.G_Builder.example1;

import com.example.designpattern.G_Builder.example1.clazz.Director;
import com.example.designpattern.G_Builder.example1.clazz.HTMLBuilder;
import com.example.designpattern.G_Builder.example1.clazz.TextBuilder;

public class Main {
    public static void main(String[] args) {
        if(args.length!=1){
            usage();
            System.exit(0);
        }
        if(args[0].equals("plain")){
            TextBuilder textBuilder=new TextBuilder();
            Director director=new Director(textBuilder);
            director.construct();
            String result=textBuilder.getResult();
            System.out.println(result);
        }else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder=new HTMLBuilder();
            Director director=new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result+"文件编写完成");
        }
    }
    public static void usage(){
        System.out.println("Usage: java main plain 编写纯文本文档");
        System.out.println("Usage: java Main html 编写HTML文档");
    }
}
