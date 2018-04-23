package com.example.designpattern.K_Composite.example1;

import com.example.designpattern.K_Composite.example1.clazz.Directory;
import com.example.designpattern.K_Composite.example1.clazz.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("making root entries");
        Directory rootDir=new Directory("root");
        Directory binDir=new Directory("bin");
        Directory tmpDir=new Directory("tmp");
        Directory usrDir=new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi",10000));
        binDir.add(new File("latex",20000));
        rootDir.printList();
        System.out.println();
        System.out.println("making user entries");
        Directory a=new Directory("a");
        Directory b=new Directory("b");
        Directory c=new Directory("c");
        usrDir.add(a);
        usrDir.add(b);
        usrDir.add(c);
        a.add(new File("diary.html",100));
        a.add(new File("composite.java",200));
        b.add(new File("memo.tex",300));
        c.add(new File("game.doc",400));
        c.add(new File("junk.mail",500));
        rootDir.printList();

    }
}
