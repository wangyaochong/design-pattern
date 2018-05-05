package com.example.designpattern.T_Flyweight.example1.clazz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;
    private String fontData;
    public BigChar(char charName){
        this.charName=charName;
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("bigChar/big"+charName+".txt"));
            String line;
            StringBuilder buffer=new StringBuilder();
            while((line=bufferedReader.readLine())!=null){
                buffer.append(line);
                buffer.append("\n");
            }
            bufferedReader.close();
            this.fontData=buffer.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println(fontData);
    }
}
