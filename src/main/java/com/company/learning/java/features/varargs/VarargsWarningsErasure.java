package com.company.learning.java.features.varargs;

import java.util.Arrays;
import java.util.List;

import javafx.util.Pair;

/**
 * @author mohanarao_sv
 *
 */
public class VarargsWarningsErasure {

    public static void main(final String... args) {
        List<List<String>> monthsInTwoLanguages = Arrays.asList(Arrays.asList("January", "February"), Arrays.asList("Gennaio", "Febbraio"));
        System.out.println(monthsInTwoLanguages);
    }

    // varargs method
    @SafeVarargs     // -- comment here to see the changes
    public static <T> void print(final T... a) {
        for (T t : a) {
            System.out.println(t);
        }
    }

    // calling method
    public static void main(final String args) {

        print("Hello", "World"); // this is fine

        print(new Pair<Integer, String>(1, "One"), new Pair<Integer, String>(2, "Two"));
        // WARNING: Type safety : A generic array of Pair<Integer,String>
        // is created for a varargs parameter
    }

    @SafeVarargs
    // WARNING SUPPRESSED: Type safety: Potential heap pollution via varargs parameter a
    public static <T> void printf(final T... a) {
        for (T t : a) {
            System.out.println(t);
        }
    }

    public static void main(final Long args) {
        print("Hello", "World");
        print(new Pair<Integer, String>(1, "One"), new Pair<Integer, String>(2, "Two"));
        // no warnings :)
    }
}
