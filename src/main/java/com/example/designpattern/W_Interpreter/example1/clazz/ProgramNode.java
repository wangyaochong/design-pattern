package com.example.designpattern.W_Interpreter.example1.clazz;

public class ProgramNode extends Node {
    private Node commandListNode;
    @Override
    public void parse(Context context) {
        context.skipToken("program");
        commandListNode=new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString(){
        return "[program"+commandListNode+"]";
    }
}
