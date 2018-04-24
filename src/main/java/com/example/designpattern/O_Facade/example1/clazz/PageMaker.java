package com.example.designpattern.O_Facade.example1.clazz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){

    }
    public static void makeWelcomePage(String mailAddr,String fileName){
        Properties properties = DataBase.getProperties("maildata");
        String userName=properties.getProperty(mailAddr);
        try {
            HtmlWriter writer= new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to "+userName+" 's page!");
            writer.paragrph(userName+"欢迎来到");
            writer.mailTo(mailAddr,userName);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
