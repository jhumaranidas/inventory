package com.inventory.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapExample {

    public static void main(String args[]){
        Map<Integer, String> empMap = new HashMap<Integer, String>();
        empMap.put(1,"Raju");
        empMap.put(2,"Anita");
        empMap.put(3,"Satish");

        //#1 Using KeySet
        for(Map.Entry<Integer, String> entrySet : empMap.entrySet()){
            System.out.println("key==" +entrySet.getKey() + ", value=="+entrySet.getValue());
        }

        //#2 Using KeySet For loop
        for(Integer id : empMap.keySet()){
            System.out.println("key==" +id + ", value=="+empMap.get(id));
        }

       //#3 Using Iterator
        Iterator<Map.Entry<Integer, String>> itr = empMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("key==" +entry.getKey() + ", value=="+entry.getValue());
        }

        //#4 Using foreach
        empMap.forEach((k,v) -> System.out.println("key==" +k + ", value=="+v));
    }


}
