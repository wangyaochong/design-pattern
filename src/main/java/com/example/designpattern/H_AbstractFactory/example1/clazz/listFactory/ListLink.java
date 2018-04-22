package com.example.designpattern.H_AbstractFactory.example1.clazz.listFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\""+url+"\">"+caption+"</a></li>\n";
    }
}
