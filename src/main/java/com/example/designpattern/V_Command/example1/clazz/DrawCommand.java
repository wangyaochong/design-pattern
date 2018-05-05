package com.example.designpattern.V_Command.example1.clazz;

import com.example.designpattern.V_Command.example1.interfaces.Command;
import com.example.designpattern.V_Command.example1.interfaces.Drawable;

import java.awt.*;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point point;
    public DrawCommand(Drawable drawable,Point point){
        this.drawable=drawable;
        this.point=point;
    }
    @Override
    public void execute() {
        drawable.draw(point.x,point.y);
    }
}
