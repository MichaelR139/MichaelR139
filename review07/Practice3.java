package com.syntax.review07;

public class Practice3 {
    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentsRecord(){
        System.out.println("The student name is: "+studentName+"and the course "+course);
        System.out.println("The student id is: "+studentId+" and the course "+grades);
    }

    public static void main(String[] args) {
        Practice3 p1=new Practice3();
        p1.studentName="Rogo";
        p1.course="SDET";
        p1.studentId=123;
        p1.grades=65;
        p1.displayStudentsRecord();

        System.out.println("--------------------------------------------");

        Practice3 p2=new Practice3();
        p2.studentName="yazina";
        p2.course="scine";
        p2.studentId=456;
        p2.grades=91;
        p2.displayStudentsRecord();
    }
}
