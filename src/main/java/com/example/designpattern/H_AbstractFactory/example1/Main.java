package com.example.designpattern.H_AbstractFactory.example1;

import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Factory;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Link;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Page;
import com.example.designpattern.H_AbstractFactory.example1.clazz.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("无参数");
            System.exit(0);
        }
        Factory factory= Factory.getFactory(args[0]);
        Link people=factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw=factory.createLink("光明日报","http://www.gmw.cn/");
        Link us_yahoo=factory.createLink("Yahoo!","http://www.yahoo.com/");
        Link jp_yahoo=factory.createLink("Yahoo Japan","http://www.yahoo.co.jp/");
        Link google=factory.createLink("Google","http://www.google.com/");
        Tray trayNew=factory.createTray("日报");
        trayNew.add(people);
        trayNew.add(gmw);
        Tray trayYahoo=factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);
        Tray traySearch=factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(google);
        Page page=factory.createPage("LinkPage","杨文轩");
        page.add(trayNew);
        page.add(traySearch);
        page.output();


    }
}
