package com.syntax.class23;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog);
        Dog dog1=new Dog("Tommy","Green");
        dog1.changeInfo("Rocky","red");
        System.out.println(dog1);

    }
}
