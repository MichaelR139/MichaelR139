package com.syntax.review07;

public class Practice2 {
    String getRecord() {
        String department = "Qa";
        String empName = "Violte";
        String details = "Worker " + empName + " belong to " + department;
        System.out.println(details);
        return details;
    }



    public static void main(String[] args) {
        Practice2 p=new Practice2();
        p.getRecord();
    }
}
