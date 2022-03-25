package com.syntax.class23;


import com.syntax.class17.Students;

/*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    public class Student {
    int grade;
    int numberOfTests;
    Student(int grade,int numberOfTests) {
        this.numberOfTests=numberOfTests;
        this.grade = grade;
    }
       void midExpectation(){
    System.out.println("Grade of Student "+grade+" Number of tests "+numberOfTests);
       }
}
    class SyntaxStudent extends Student{
        public SyntaxStudent( int grade,int numberOfTests) {
            super( grade,numberOfTests);
        }
            @Override
        void midExpectation(){
                System.out.println("Grade of SyntaxStudent "+grade+" Number of tests "+numberOfTests);
            }
    }
    class CollegeStudent extends Student{
        public CollegeStudent( int grade,int numberOfTests) {
            super( grade,numberOfTests);
        }
        @Override
        void midExpectation() {
            System.out.println("Grade of CollegeStudent "+grade+" Number of tests "+numberOfTests);
        }
    }
    class SchoolStudent extends Student {
        public SchoolStudent( int grade,int numberOfTests) {
            super( grade,numberOfTests);
        }
        @Override
        void midExpectation(){
            System.out.println("Grade of SchoolStudent "+grade+" Number of tests "+numberOfTests);
        }
        public static void main(String[] args) {
            SyntaxStudent r=new SyntaxStudent(77,12);
            r.midExpectation();
            CollegeStudent t=new CollegeStudent(88,23);
            t.midExpectation();
            SchoolStudent s=new SchoolStudent(76,45);
            s.midExpectation();

        }
    }

