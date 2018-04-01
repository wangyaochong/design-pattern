package com.example.designpattern.Iterator;

import com.example.designpattern.Iterator.clazz.Book;
import com.example.designpattern.Iterator.clazz.BookShelf;
import com.example.designpattern.Iterator.interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book= (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
