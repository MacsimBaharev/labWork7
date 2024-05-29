package org.example;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface Comparator<T> {
    int compare(T t, T u);
}

public class Main {
    public static void main(String[] args) {
        Comparator ref = (x, y) -> {
            return x.toString().length() - y.toString().length();
        };

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        ArrayList<String> strings1 = new ArrayList<>(Arrays.asList("1", "2", "3", "43"));

        //System.out.println(integers.toString().length() + "\n" + integers1.toString().length() + "\n" + strings.toString().length());
        System.out.println(ref.compare(integers, integers1));
        System.out.println(ref.compare(strings, strings1));
    }
}