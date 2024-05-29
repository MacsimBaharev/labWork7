package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 5, 7, 9, 7, 5, 8, 3, 0, 4));

        integers.stream().sorted().distinct().limit(2).skip(1).forEach(System.out::println);
        integers.stream().sorted().distinct().skip(integers.stream().distinct().count() - 2).limit(1).forEach(System.out::println);
    }
}