package com.syntax.class22;


public class HW3 {
    private static HW3 print;

    /*
        Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
    :+1::+1::skin-tone-2:
         */
    private void printInfo(){
        System.out.println("Without prameters");
    }
    private void printInfo(String text){
        System.out.println("1 parameters "+text);
    }
    private void printInfo(String text,String text1){
        System.out.println("2 parameters "+text+","+text1);
    }

    public static void main(String[] args) {
        HW3.print=new HW3();
        print.printInfo();
        print.printInfo("programming languages");
        print.printInfo("programming languages","I love Java");
    }
}
