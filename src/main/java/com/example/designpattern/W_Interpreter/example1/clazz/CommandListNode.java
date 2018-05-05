package com.example.designpattern.W_Interpreter.example1.clazz;

import java.util.ArrayList;

public class CommandListNode extends Node{
    private ArrayList<Node> list=new ArrayList<>();
    @Override
    public void parse(Context context) {
        while(true){
            if(context.currentToken()==null){
                throw new RuntimeException("missing end");
            }else if(context.currentToken().equals("end")){
                context.skipToken("end");
                break;
            }else{
                Node commandNode=new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    public String toString(){
        return list.toString();
    }
}
