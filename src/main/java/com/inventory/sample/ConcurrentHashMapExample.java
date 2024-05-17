package com.inventory.sample;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String args[]){

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        map.put("A1", 100);
        map.put("A2", 200);
        map.put("A3", 300);

        System.out.println("Map size is " + map.size());

        int valueA1 = map.get("A1");
        System.out.println("Value of A1 is " + valueA1);

        map.remove("A3");
        System.out.println("Map size " + map.size());

    }
}
