package com.example.designpattern.A_Iterator.exercise;

import com.example.designpattern.A_Iterator.example1.interfaces.Iterator;

public class BookShelfAutoExtendIterator implements Iterator {
    BookShelfAutoExtend bookShelfAutoExtend;
    int currnetIndex=0;
    public BookShelfAutoExtendIterator(BookShelfAutoExtend bookShelfAutoExtend){
        this.bookShelfAutoExtend=bookShelfAutoExtend;
    }
    @Override
    public boolean hasNext() {
        return currnetIndex<bookShelfAutoExtend.getLength();
    }

    @Override
    public Object next() {
        currnetIndex++;
        return bookShelfAutoExtend.getBookAt(currnetIndex-1);
    }
}
