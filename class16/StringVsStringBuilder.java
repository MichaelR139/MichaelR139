package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar Is Great");
        s.concat("hahah");
         System.out.println(s.concat("hahah"));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");

        stringBuilder.append("Hahha");
         System.out.println(stringBuilder.append("Hahha"));
        System.out.println(stringBuilder);
    }

    }

