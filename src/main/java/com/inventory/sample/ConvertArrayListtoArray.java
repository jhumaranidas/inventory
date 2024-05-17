package com.inventory.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListtoArray {
    public static void main(String args[]) {
        List<String> monthList = new ArrayList<>();
        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");

        String[] array = monthList.toArray(new String[monthList.size()]);
        for(String s: array){
            System.out.println(s);
        }

        List<String> monthList1 = new ArrayList<>();
        monthList1 = Arrays.asList(array);
    }
}
