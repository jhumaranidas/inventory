package com.inventory.sample;

public class SingleToneDesignPatternExample {

    private static SingleToneDesignPatternExample obj;

    private SingleToneDesignPatternExample(){}

    private static SingleToneDesignPatternExample getSInstance(){
        if(obj==null){
            synchronized (SingleToneDesignPatternExample.class){
                obj = new SingleToneDesignPatternExample();
            }
        }
        return obj;
    }
}
