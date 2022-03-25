package com.syntax.class17;

public class SyntaxEmploee {
    String empId;
    double salary;
    static String CED="Sumair";

    public static void main(String[] args) {
        SyntaxEmploee aselObject=new SyntaxEmploee();
        aselObject.empId="123";
        aselObject.salary=200000;
        System.out.println(aselObject.empId);
        System.out.println(aselObject.salary);
        System.out.println(aselObject.CED);

        SyntaxEmploee r=new SyntaxEmploee();
        r.empId="456";
        r.salary=198000;
        System.out.println(r.empId);
        System.out.println(r.salary);
        System.out.println(r.CED);

    }
}
