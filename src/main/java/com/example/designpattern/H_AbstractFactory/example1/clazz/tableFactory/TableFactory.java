package com.example.designpattern.H_AbstractFactory.example1.clazz.tableFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Factory;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Link;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
