package com.example.designpattern.O_Facade.example1.clazz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataBase {
    private DataBase(){

    }
    public static Properties getProperties(String dbName){
        String fileName=dbName+".txt";
        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {

        }
        return properties;
    }
}
