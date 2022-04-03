package com.syntax.rewiew09;

public class Doctor {
   public String firstName;
     protected  String     lastName;
      String         speciality;
      private double salary;
    //static v
    static String hospital="Jorge Washington";
   protected static void work(){
        System.out.println("All doctors");
    }
    void hello(){
        System.out.println("Hello");
    }
    //stsatic and non static members
     public void printInfo(){
        this.hello();//we dont need put this(compailer it)
        System.out.println("Doctor"+firstName+" "+lastName+" is a "+speciality+" at "+hospital);
    }
     void work1(){// can work with static variables
        System.out.println("All doctors"+ hospital);
    }
//Constractor can have access modifier
    public Doctor(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
    }
    public Doctor(String firstName,String lastName,String speciality) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.speciality=speciality;

    }
    void getPaid(){
        System.out.println("Doctor "+firstName+" "+lastName+"gest paid "+salary);
    }
}
