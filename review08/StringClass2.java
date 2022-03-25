package com.syntax.review08;

import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) {


    String student="Teifur";
        System.out.println(student.startsWith("T"));// output true
        System.out.println(student.toLowerCase().startsWith("T"));// false  цепочка методов
        System.out.println(student.endsWith("r"));//true
        System.out.println(student.contains("y"));//false

        String name ="habib";
        char output=name.charAt(2);
        System.out.println(output);//b








}
}