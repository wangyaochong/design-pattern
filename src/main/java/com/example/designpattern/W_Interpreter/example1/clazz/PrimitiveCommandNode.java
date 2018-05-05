package com.example.designpattern.W_Interpreter.example1.clazz;

public class PrimitiveCommandNode extends Node{
    private String name;

    @Override
    public void parse(Context context) {
        name=context.currentToken();
        context.skipToken(name);
        if(!name.equals("go")&&!name.equals("right")&&!name.equals("left")){
            throw new RuntimeException(name+"is not defined");
        }
    }
    public String toString(){
        return name;
    }
}
