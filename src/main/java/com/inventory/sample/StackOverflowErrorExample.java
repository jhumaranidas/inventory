package com.inventory.sample;

public class StackOverflowErrorExample {
    public static void main(String args[]){

        StackOverflowErrorExample.getAdditionValue(5);
    }

    public static Integer getAdditionValue(Integer i){
        i=i+5;
        getAdditionValue(i);
        return i;
    }
}
