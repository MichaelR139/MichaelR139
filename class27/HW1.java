package com.syntax.class27;

import java.util.ArrayList;

public class HW1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Michael");
        names.add("Helen");
        names.add("Pol");
        names.add("Ivan");
        System.out.println(names);

        if (names.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
        if (names.contains("Ivan")) {
            System.out.println("Ivan in the ArrayList");
        } else {
            System.out.println("no Ivan in the ArrayList");
        }
        System.out.println(names.size());
        System.out.println(names);

    }
}


