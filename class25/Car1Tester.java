package com.syntax.class25;

public class Car1Tester {
    public static void main(String[] args) {
        Sedan r=new Sedan(3456,"Black",34);
        r.calculateSalePrice();
        Truck t=new Truck(3456,"Black",1900);
        t.calculateSalePrice();
    }
}
