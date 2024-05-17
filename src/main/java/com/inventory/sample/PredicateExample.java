package com.inventory.sample;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main( String[] args) {
    Predicate<String> startsWithCharJ =
            s -> s.startsWith( "H" );
    Predicate<String> hasLengthOfInt5 =
            s -> s.length() == 5;


    // Calling without negate method
        System.out.println(startsWithCharJ.test("Horse"));;
    // Calling without negate method
        System.out.println(
                hasLengthOfInt5.test( "India" )
                );

    Predicate<String> negateStartsWithCharJ =
            startsWithCharJ.negate();
    Predicate<String> negatehasLengthOfInt5 =
            hasLengthOfInt5.negate();

    // Calling after negate predicate
        System.out.println(
                negateStartsWithCharJ.test( "Horse" )
                );
    // Calling after negate predicate
        System.out.println(
                negatehasLengthOfInt5.test( "India" )
                );
    }
}
