package com.example.designpattern.W_Interpreter.example1.clazz;

public class RepeatCommandNode extends Node{

    private int number;
    private Node commandListNode;
    @Override
    public void parse(Context context) {
        context.skipToken("repeat");
        number=context.currentNumber();
        context.nextToken();
        commandListNode=new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString(){
        return "repeat"+number+" "+commandListNode;
    }
}
