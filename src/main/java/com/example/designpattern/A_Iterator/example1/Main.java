package com.example.designpattern.A_Iterator.example1;

import com.example.designpattern.A_Iterator.example1.clazz.Book;
import com.example.designpattern.A_Iterator.example1.clazz.BookShelf;
import com.example.designpattern.A_Iterator.exercise.BookShelfAutoExtend;
import com.example.designpattern.A_Iterator.example1.interfaces.Iterator;

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

        BookShelfAutoExtend bookShelf2=new BookShelfAutoExtend();
        bookShelf2.appendBook(new Book("Around the World in 80 Days"));
        bookShelf2.appendBook(new Book("Bible"));
        bookShelf2.appendBook(new Book("book3"));
        bookShelf2.appendBook(new Book("book4"));
        Iterator iterator2 = bookShelf2.iterator();
        while(iterator2.hasNext()){
            Book book= (Book) iterator2.next();
            System.out.println(book.getName());
        }
    }
}
