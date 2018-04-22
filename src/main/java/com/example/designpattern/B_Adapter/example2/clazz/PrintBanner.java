package com.example.designpattern.B_Adapter.example2.clazz;

import com.example.designpattern.B_Adapter.example1.clazz.Banner;

public class PrintBanner extends Print {
    Banner banner;
    public PrintBanner(String string){
        this.banner=new Banner(string);
    }
    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
