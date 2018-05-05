package com.example.designpattern.W_Interpreter.example1.clazz;

import java.text.ParseException;
import java.util.StringTokenizer;

public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;
    public Context(String text){
        tokenizer=new StringTokenizer(text);
        nextToken();

    }
    public String nextToken(){
        if(tokenizer.hasMoreTokens()){
            currentToken=tokenizer.nextToken();
        }else{
            currentToken=null;
        }
        return currentToken;
    }
    public String currentToken(){
        return currentToken;
    }
    public void skipToken(String token){
        if(!token.equals(currentToken)){
            throw new RuntimeException(token+" is not "+currentToken);
        }
        nextToken();
    }
    public int currentNumber(){
        int number=0;
        number=Integer.parseInt(currentToken);
        return number;
    }
}
