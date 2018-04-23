package com.example.designpattern.M_Visitor.example1.interfaces;

import com.example.designpattern.M_Visitor.example1.clazz.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
