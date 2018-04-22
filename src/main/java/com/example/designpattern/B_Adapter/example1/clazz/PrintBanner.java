package com.example.designpattern.B_Adapter.example1.clazz;

import com.example.designpattern.B_Adapter.example1.clazz.Banner;
import com.example.designpattern.B_Adapter.example1.interfaces.Print;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
