package com.syntax.class19;

public class HW1 {
    /*
      @here Write a java class that have 4 constructors with 4 different access levels of
      constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
       2 - from outside the class; 3 - from different class inside different package  and observe result.

  Write program that have static constructor and observe result.

  Write a Student class   that have instance variables name and address.
   Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.

  Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
  Instance variables are being initialized
  Both Constructors are being executed
     */
    int r1;
    int r2;
    int r3;

    protected HW1(int r1, int r2, int r3) {
        System.out.println("Protected constr.");
    }

    public HW1(int r1, int r2) {
        System.out.println("Public constr.");
    }

     HW1(int r1) {
        System.out.println("Private constr");
    }

    HW1() {
        System.out.println("Default constr");
    }







}
