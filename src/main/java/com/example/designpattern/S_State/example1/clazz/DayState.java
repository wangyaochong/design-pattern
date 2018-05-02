package com.example.designpattern.S_State.example1.clazz;

import com.example.designpattern.S_State.example1.interfaces.Context;
import com.example.designpattern.S_State.example1.interfaces.State;

public class DayState implements State {
    private static DayState state=new DayState();
    public static DayState getInstance(){
        return state;
    }
    private DayState(){

    }
    @Override
    public void doClock(Context context, int hour) {
        if(hour<9||17<=hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }
    public String toString(){
        return "【白天】";
    }
}
