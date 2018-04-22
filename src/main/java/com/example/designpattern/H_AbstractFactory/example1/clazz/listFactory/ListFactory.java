package com.example.designpattern.H_AbstractFactory.example1.clazz.listFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Factory;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Link;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Tray;

public class ListFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
