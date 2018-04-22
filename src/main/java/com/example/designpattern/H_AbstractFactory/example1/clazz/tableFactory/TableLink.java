package com.example.designpattern.H_AbstractFactory.example1.clazz.tableFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<td><a href =\""+url+"\">"+caption+"</a></td>\n";
    }
}
