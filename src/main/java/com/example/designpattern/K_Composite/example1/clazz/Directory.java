package com.example.designpattern.K_Composite.example1.clazz;

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
        return name;
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

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            next.printList(prefix+"/"+name);
        }
    }
}
