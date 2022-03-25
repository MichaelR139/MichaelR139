package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {


    Student student=new Student();
    student.name="Zuh";
        System.out.println(student.name);
        student.printName();
        System.out.println("-------------------------------");
        Principle principle=new Principle();
        principle.name="Gul";
        principle.printName();
        principle.specialParkingSlot=false;


}
}
