package com.syntax.class19;

public class Student {
    /*Write a Student class   that have instance variables name and address.
   Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.
     */
    String name;
    String adress;

    Student(String name,String adress){
        this.name=name;
        this.adress=adress;
    }
        void displayInfo() {
            System.out.println("Student name "+name+"Student adress "+adress);

    }
}
