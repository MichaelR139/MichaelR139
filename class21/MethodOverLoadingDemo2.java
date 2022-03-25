package com.syntax.class21;

public class MethodOverLoadingDemo2 {
    void printinfo(String name,int age,double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }

         void printinfo(int age,String name,  double weight) {
             System.out.println("M2");
            System.out.println(name + " " + age + " " + weight);
        }


             void printinfo(double weight,String name, int age) {
                 System.out.println("M3");
                System.out.println(name + " " + age + " " + weight);
            }

    public static void main(String[] args) {
        MethodOverLoadingDemo2 methodOverLoadingDemo2=new MethodOverLoadingDemo2();
        methodOverLoadingDemo2.printinfo("zulfia",16,28.0);
    }
        }


