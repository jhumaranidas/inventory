package com.inventory.sample;

public class SmallestLargestNumberArray {
    public static void main(String[] args){
        Integer[] array = {4,7,2,8,2,300,23,50,250,450};


        Integer samllest = array[0];
        Integer largest = array[0];

        for(int i=0;i< array.length;i++){
            if(array[i]<samllest){
                samllest = array[i];
            }else if(array[i]>largest){
                largest = array[i];
            }
        }

        System.out.println("Smallest number ="+samllest);
        System.out.println("Largest number ="+largest);
    }
}
