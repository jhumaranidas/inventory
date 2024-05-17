package com.inventory.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInteger {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        String s="sds sdsd fdfdf dsdsd sds ddd ddd";
        String[] array=s.split(" ");

        String s1= Arrays.stream(array)
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.println(s1);


        /*List<Integer> l1 = list.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println(l1);

        List<Integer> l2 = list.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println(l2);*/

    }
}
