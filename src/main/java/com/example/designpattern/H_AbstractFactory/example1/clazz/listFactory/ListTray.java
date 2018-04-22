package com.example.designpattern.H_AbstractFactory.example1.clazz.listFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Item;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        while(iterator.hasNext()){
            Item item= iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}
