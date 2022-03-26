package com.syntax.class27;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(1,100);

        LinkedList<Integer>numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1,100);
    }
}
