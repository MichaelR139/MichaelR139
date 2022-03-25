package com.syntax.review08;

public class Class2 {
    String generateUserName(String firstName,String lastName){
        return firstName+"123"+lastName+".com";
    }
 static void moreadDemand(){
     System.out.println("Tis is moread's function");
 }
    public static void main(String[] args) {
        moreadDemand();
        Class2 r=new Class2();
        System.out.println(r.generateUserName("emilia","gulnar"));
    }
}
