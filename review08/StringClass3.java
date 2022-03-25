package com.syntax.review08;

public class StringClass3 {
    public static void main(String[] args) {
        String batch = "Batch 12";
        String course = "sdet";

        String company="   Syntax   Tech      ";
        System.out.println(company.trim());

        String name="nasir     hdkdked  rjrrrrm  ekdndnkrndr";
        System.out.println(name.replaceAll(" ",""));//without spase

        if ("Batch 12".equals(batch) && "SDET".equals(course)) {
            System.out.println("You like my lecture");

        } else {
            System.out.println("Watch my youtube");
        }
        if ("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)) {
            System.out.println("Now all types of input accepted");

        }
    }
}
