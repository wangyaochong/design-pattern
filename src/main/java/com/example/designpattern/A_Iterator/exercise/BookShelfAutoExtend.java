package com.example.designpattern.A_Iterator.exercise;

import com.example.designpattern.A_Iterator.clazz.Book;
import com.example.designpattern.A_Iterator.clazz.BookShelfIterator;
import com.example.designpattern.A_Iterator.interfaces.Aggregate;
import com.example.designpattern.A_Iterator.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelfAutoExtend implements Aggregate {

    List<Book> bookList=new ArrayList<>();


    @Override
    public Iterator iterator() {
        return new BookShelfAutoExtendIterator(this);
    }


    public Book getBookAt(int index){
        return bookList.get(index);
    }
    public void appendBook(Book book){
        bookList.add(book);
    }
    public int getLength(){
        return bookList.size();
    }
}
