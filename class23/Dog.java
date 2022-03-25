package com.syntax.class23;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Dog() {
        System.out.println("No argument ");
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String color) {
        this.color = color;
        this.name = name;
    }

    void changeInfo(String name) {

    }

    void changeInfo(String name, String color) {
        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
