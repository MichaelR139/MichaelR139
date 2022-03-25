package com.syntax.class22;

public class MethodDemo {
    public static void main(String[] args) {
        add(19);
        add(10, 10);
        add(10, 10, 10, 10);
    }

    /* static void  add(int num,int num2){
         System.out.println(num+num2);
     }
     static void  add(int num,int num2,int num3){
         System.out.println(num+num2+num3);
 }*/
    static void add(int... numArray) {
        int sum = 0;
        for (int num : numArray) {
            sum = sum + num;
        }

        System.out.println(sum);
    }
}