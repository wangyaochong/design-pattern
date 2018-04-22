package com.example.designpattern.H_AbstractFactory.example1.clazz.tableFactory;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Item;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<html charset='utf-8'><head><title>").append(title).append("</title>").append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />").append("</head>\n");

        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\" >\n");
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            buffer.append("<tr>").append(next.makeHtml()).append("</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>").append(author).append("</address></body></html>\n");

        return buffer.toString();
    }
}
