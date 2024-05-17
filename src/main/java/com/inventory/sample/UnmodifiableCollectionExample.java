package com.inventory.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionExample {
    public static void main(String args[]) {
        List<String> monthList = new ArrayList<>();
        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");

        Collections.synchronizedList(monthList);

        Collection<String>
                unModifiedlist = Collections
                .unmodifiableCollection(monthList);

        unModifiedlist.add("May");
    }
}
