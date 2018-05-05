package com.example.designpattern.W_Interpreter.example1.clazz;

public class CommandNode extends Node{
    private Node node;
    @Override
    public void parse(Context context) {
        if(context.currentToken().equals("repeat")){
            node=new RepeatCommandNode();
            node.parse(context);
        }else{
            node=new PrimitiveCommandNode();
            node.parse(context);
        }
    }
    public String toString(){
        return node.toString();
    }
}
