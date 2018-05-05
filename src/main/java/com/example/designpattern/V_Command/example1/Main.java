package com.example.designpattern.V_Command.example1;

import com.example.designpattern.V_Command.example1.clazz.DrawCanvas;
import com.example.designpattern.V_Command.example1.clazz.DrawCommand;
import com.example.designpattern.V_Command.example1.clazz.MacroCommand;
import com.example.designpattern.V_Command.example1.interfaces.Command;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener,MouseMotionListener,WindowListener {
    private MacroCommand history=new MacroCommand();
    private DrawCanvas canvas=new DrawCanvas(400,400,history);
    private JButton clearButton=new JButton("clear");
    public Main(String title){
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        Box buttonBox=new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox=new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clearButton){
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command command=new DrawCommand(canvas,e.getPoint());
        history.append(command);
        command.execute();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new Main("command pattern sample");
    }
}
