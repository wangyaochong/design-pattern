package com.example.designpattern.W_Interpreter.example1;

import com.example.designpattern.W_Interpreter.example1.clazz.Context;
import com.example.designpattern.W_Interpreter.example1.clazz.Node;
import com.example.designpattern.W_Interpreter.example1.clazz.ProgramNode;

public class Main {
    public static void main(String[] args) {
        String text="program repeat 4 repeat 3 go right go left end  right end end";
        Node node=new ProgramNode();
        node.parse(new Context(text));
        System.out.println(node.toString());
    }
}
