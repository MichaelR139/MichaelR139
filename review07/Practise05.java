package com.syntax.review07;

import java.util.Locale;

public class Practise05 {
    String weekDay(String day) {
        day= day.toLowerCase(Locale.ROOT);
        switch (day) {
            case "monday":
                return "it is lasy day";
            default:
                return "no correct";
        }
    }

    public static void main(String[] args) {
        Practise05 p = new Practise05();
        p.weekDay("monday");
        String output=p.weekDay("monday");
        System.out.println(output);
    }
}