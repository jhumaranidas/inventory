package com.inventory.sample;

import java.util.function.Consumer;
public class ConsumerInterfaceExample {

    static void welcomeGreeting (String name){
        System.out.println( "Welcome "+name);
    }
    static void showAge (int age){
        System.out.println( "Your age is "+age);
    }
    static void showSalary (int sal){
        System.out.println( "Your salary is "+sal);
    }

    static void lastMessage (String name){
        System.out.println( "See you again! Bye "+ name);
    }

    public static void main(String[] args) {
        Consumer<String> lastConsumer =
                ConsumerInterfaceExample :: lastMessage;



        //method reference
        Consumer<String> consumer1 =
                ConsumerInterfaceExample :: welcomeGreeting;
        // Calling Consumer method
        consumer1.accept("Tejas");


        //method reference
        Consumer<Integer> consumer2 =
                ConsumerInterfaceExample :: showAge;
        // Calling Consumer method
        consumer2.accept(30);

        //method reference
        Consumer<Integer> consumer3 =
                ConsumerInterfaceExample :: showSalary;
        // Calling Consumer method
        consumer3.accept(20000);

        consumer1.andThen(lastConsumer);
    }


}

