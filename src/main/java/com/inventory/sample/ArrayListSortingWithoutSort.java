package com.inventory.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSortingWithoutSort {

    public static void main(String[] args){

        List<Integer> list= new ArrayList<Integer>();
        List<Integer> list1= new ArrayList<Integer>();

        list.add(50);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(-30);



        for(int i=0;i<list.size();i++){
            for(int j=list.size()-1;j>i;j--){
                if (list.get(i) > list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i,list.get(j)) ;
                    list.set(j,tmp);
                }

            }
        }
        System.out.println(list);
    }
}
