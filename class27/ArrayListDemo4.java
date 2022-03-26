package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruit =new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");

        ArrayList<String> vegetable =new ArrayList<>();
        vegetable.add("potatto");
        vegetable.add("onion");
        vegetable.add("carrot");

        ArrayList<String>groceries=new ArrayList<>();
        groceries.addAll(fruit);
        groceries.addAll(vegetable);
        System.out.println(groceries);
        ArrayList<String>itemsToBeRemove=new ArrayList<>();
        itemsToBeRemove.add("apple");
        itemsToBeRemove.add("onion");

        groceries.removeAll(itemsToBeRemove);
        System.out.println(groceries);

    }
}
