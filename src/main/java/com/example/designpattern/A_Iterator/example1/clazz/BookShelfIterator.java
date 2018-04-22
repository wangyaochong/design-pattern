package com.example.designpattern.A_Iterator.example1.clazz;

import com.example.designpattern.A_Iterator.example1.interfaces.Iterator;

public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        if(index<bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public Object next() {
        Book book=bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
