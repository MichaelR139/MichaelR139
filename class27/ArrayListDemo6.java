package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("apple","orange","banana");
        /*fruit.add("Apple");
        fruit.add("orange");
        fruit.add("banana");

        ArrayList<String> vegetable =new ArrayList<>();
        vegetable.add("potatto");
        vegetable.add("Onion");
        vegetable.add("carrot");

        ArrayList<String>groceries=new ArrayList<>();
        groceries.addAll(fruit);
        groceries.addAll(vegetable);
     */
        System.out.println(groceries);

        ArrayList<String>List2=new ArrayList<>();
        List2.add("Apple");
        List2.add("Onion");
        System.out.println(groceries.containsAll(List2));
    }
}
