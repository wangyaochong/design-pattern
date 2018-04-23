package com.example.designpattern.M_Visitor.example1.clazz;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir="";

    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String saveDir=currentDir;
        currentDir=currentDir+"/"+directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            next.accept(this);
        }
        currentDir=saveDir;
    }
}
