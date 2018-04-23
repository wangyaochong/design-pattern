package com.example.designpattern.M_Visitor.example1.clazz;

import com.example.designpattern.K_Composite.example1.clazz.FileTreatmentException;
import com.example.designpattern.M_Visitor.example1.interfaces.Element;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry){
        throw new FileTreatmentException();
    }
    public Iterator iterator() {
        throw new FileTreatmentException();
    }
    @Override
    public void accept(Visitor visitor) {

    }
    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
