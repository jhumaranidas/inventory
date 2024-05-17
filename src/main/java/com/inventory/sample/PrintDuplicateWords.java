package com.inventory.sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintDuplicateWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println();
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            String result = Arrays.stream(array)
                    .distinct()
                    .collect(Collectors.joining(" "));
            System.out.println(result);
        }
    }
}
