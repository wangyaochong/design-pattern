package com.example.designpattern.M_Visitor.example1.clazz;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory=new ArrayList<>();
    public Directory(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            size+=next.getSize();
        }
        return size;
    }

    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }
    @Override
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
