package com.example.designpattern.V_Command.example1.clazz;

import com.example.designpattern.V_Command.example1.interfaces.Drawable;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color=Color.red;
    private int radius=6;
    private MacroCommand history;
    public DrawCanvas(int width,int height,MacroCommand history){
        setSize(width,height);
        setBackground(Color.white);
        this.history=history;
    }
    @Override
    public void draw(int x, int y) {
        Graphics g=getGraphics();
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }
    public void paint(Graphics graphics){
        history.execute();
    }
}
