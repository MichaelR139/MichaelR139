package com.syntax.review08;

public class Class1 {
    public void printSmallerDigit(int x,int y){
      if(x<y){
          System.out.println(x+"x smaller one");
      }else if(y<x){
          System.out.println(y+"Y is smaller");
      }else{
          System.out.println("Both same");
      }
    }

    public static void main(String[] args) {
        Class1 r=new Class1();
        r.printSmallerDigit(3,5);
        r.printSmallerDigit(5,8);
    }
}
