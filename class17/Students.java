package com.syntax.class17;

public class Students{
String name;
String id;
static int numberOfStudents;
    public static void main(String[] args) {
        Students students1=new Students();
        students1.name="Yazgul";
         students1.id="123";
         Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
