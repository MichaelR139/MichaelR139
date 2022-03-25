package com.syntax.class19;

public class Horse {
    private String name;
    private int age;
    private double weight;
    //no arguments constractor
Horse(){

}
Horse(String horseName,int horseAge,double horseWeight) {
    name = horseName;
    age=horseAge;
    weight=horseWeight;
}
    void printHorseName(){
        System.out.println("Name"+name);
    }

}
