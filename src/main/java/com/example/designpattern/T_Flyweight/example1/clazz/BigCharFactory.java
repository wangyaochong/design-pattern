package com.example.designpattern.T_Flyweight.example1.clazz;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap<String,BigChar> pool=new HashMap();
    private static BigCharFactory singleton=new BigCharFactory();
    private BigCharFactory(){

    }
    public static BigCharFactory getInstance(){
        return singleton;
    }
    public synchronized BigChar getBigChar(char charName){
        BigChar bc=pool.get(""+charName);
        if(ObjectUtils.isEmpty(bc)){
            bc=new BigChar(charName);
            pool.put(""+charName,bc);
        }
        return bc;
    }
}
