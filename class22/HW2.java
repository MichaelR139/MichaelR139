package com.syntax.class22;

public class HW2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.
     */
    static  void overLoadedMethod(){
        System.out.println("Without parametres");
    }
    static void overLoadedMethod(String text){
        System.out.println("1 parametres"+text);
    }
    static void overLoadedMethod(String text,String text1){
        System.out.println("2 parametres"+text+" ,"+text1);
    }

    public static void main(String[] args) {
        HW2.overLoadedMethod();
        HW2.overLoadedMethod("I love programming languages");
        HW2.overLoadedMethod("I love programming languages","I love Java");
    }
}
