package com.syntax.class19;

public class Task2 {
    String name;
    double s2;
    double s1;
    double s3;

    public Task2(String name,double s1,double s2,
                 double s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }void printAvgGrade(){
        System.out.println((s1+s2+s3)/3);
    }


    }

