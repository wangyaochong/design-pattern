package com.example.designpattern.M_Visitor.example1.clazz;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
