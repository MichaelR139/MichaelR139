package com.syntax.class18;

public class Task2 {
    public static String reverse(String input) {
       /* Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
        String reverseStr = "";
        StringBuilder s1 = new StringBuilder(input);
        reverseStr = s1.reverse().toString();
        return reverse;
       */
        //object creating StringBuilder(input)
        //StringBuilder(input).reverse() calling a method on the object
        return new StringBuilder(input).reverse().toString(); //and returning the result
    }


    public static void main(String[] args) {
        String name ="Emily";
        System.out.println(Task2.reverse(name));
    }
}
