package com.syntax.review08;

public class StringClass4 {
    public static void main(String[] args) {
        String message="This is the great batch but is dreams";
       for(int i=0;i<message.length();i++){
           System.out.println(message.charAt(i)+" ");//vertical output
           System.out.print(message.charAt(i)+" ");//gorisontal output
       }
    }
}
