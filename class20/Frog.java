package com.syntax.class20;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name,String color,int age) {

        this.name = name;
        this.color=color;
        this.age=age;
        weight=10;
    }

    public Frog(String name,String color,int age,
                double weight) {
        this(name,color,age);//без точки
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        Frog frog=new Frog("Valera","pink",16,28);
        frog.printInfo();

        new Frog("Frogy","green",10).printInfo();

    }
}
