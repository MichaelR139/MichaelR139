package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //set(courses.size()-1,"Happy");==replace
        List<String> course =new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("Git");
        course.add("Selenium");
        course.add("Testing");
        course.add("Cucumber");
        course.add("SQL");
        course.add("API");
        course.add("Jenkins");
        course.add("Interview");
        course.add("Resume");
        course.add("AWS");
        course.add("Dead");
        course.add("APM");
        course.add("Docker");
        course.add("Dead");

        System.out.println(course);
        course.set(course.indexOf("Dead"),"Happy");
        //course.set(course.size()-1, "Happy");
        course.set(4,"Happy");
        System.out.println(course);

    }
}

