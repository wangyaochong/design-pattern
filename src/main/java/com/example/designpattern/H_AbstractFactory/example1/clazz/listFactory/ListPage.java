package com.example.designpattern.H_AbstractFactory.example1.clazz.listFactory;

import com.example.designpattern.G_Builder.example1.interfaces.Builder;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Item;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<html charset='utf-8'><head><title>").append(title).append("</title>").append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />").append("</head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = content.iterator();
        while(iterator.hasNext()){
            Item item=iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
