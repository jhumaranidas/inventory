package com.inventory.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) throws IOException {
        Integer[] array = new Integer[3];
        array[0]=3;
        array[1]=4;
        array[2]=5;

        Integer[] array1 = {3,4,5};



        FileReader file = new FileReader("C:\\folder1\\sample.txt");
        BufferedReader br = new BufferedReader(file);

        while(br.readLine()!=null) {
            System.out.println(br.readLine());
        }

        br.close();
    }

}
