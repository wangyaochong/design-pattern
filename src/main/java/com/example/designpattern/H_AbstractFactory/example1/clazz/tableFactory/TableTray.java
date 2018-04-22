package com.example.designpattern.H_AbstractFactory.example1.clazz.tableFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Item;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray{
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""+tray.size()+"\"><b>"+caption+"</b>＜/td>");
        buffer.append("</tr>\n");
        buffer.append("</tr>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            buffer.append(next.makeHtml());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
