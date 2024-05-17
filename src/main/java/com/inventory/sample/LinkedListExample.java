package com.inventory.sample;

import java.io.IOException;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) throws IOException {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A1");
        ll.add("A2");
        ll.addLast("A3");
        ll.addFirst("A4");
        ll.add(1, "A5");

        System.out.println(ll);
        //ll.pop();pop the first element
        //ll.poll(); poll and remove the head element
        ll.add("A6");
        ll.remove("A2");
        //ll.remove(2);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
