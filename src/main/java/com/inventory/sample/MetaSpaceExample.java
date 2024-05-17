package com.inventory.sample;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

public class MetaSpaceExample {
    public static void main(String args[]) {
        MemoryUsage memory = ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage();

        long usedMetaspace = memory.getUsed();

        long maxMetaspace = memory.getMax();

        System.out.println("usedMetaspace="+usedMetaspace);
        System.out.println("maxMetaspace="+maxMetaspace);

    }
}
