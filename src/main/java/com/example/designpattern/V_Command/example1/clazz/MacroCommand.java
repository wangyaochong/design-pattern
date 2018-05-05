package com.example.designpattern.V_Command.example1.clazz;

import com.example.designpattern.V_Command.example1.interfaces.Command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands=new Stack<>();
    @Override
    public void execute() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command next = iterator.next();
            next.execute();
        }
    }
    public void append(Command command){
        if(command!=this){
            commands.push(command);
        }
    }
    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }
    public void clear(){
        commands.clear();
    }
}
