package com.inventory.sample;

public class MultiDimentationalArrayExample {
    public static void main(String args[]){
        Integer[][] array = new Integer[10][20];

        for(int i=0;i<10;i++){
            for(int j=0;j<20;j++){
                array[i][j] = i*j;
            }
        }
    }
}
