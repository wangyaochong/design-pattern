package com.example.designpattern.P_Mediator.example1.clazz;

import com.example.designpattern.P_Mediator.example1.interfaces.Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener,Mediator {
    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;
    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("username:"));
        add(textUser);
        add(new Label("password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();
        pack();
        show();
    }
    @Override
    public void createColleagues() {
        CheckboxGroup g=new CheckboxGroup();
        checkGuest=new ColleagueCheckBox("Guest",g,true);
        checkLogin=new ColleagueCheckBox("Login",g,false);
        textUser = new ColleagueTextField("", 10);
        textPass=new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOk=new ColleagueButton("Ok");
        buttonCancel=new ColleagueButton("Cancel");
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else{
            textUser.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged(){
        if(textUser.getText().length()>0){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length()>0){
                buttonOk.setColleagueEnabled(true);
            }else{
                buttonOk.setColleagueEnabled(false);
            }
        }else{
            textPass.setColleagueEnabled(false);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
