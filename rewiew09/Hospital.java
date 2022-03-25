package com.syntax.rewiew09;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc= new Doctor("John","Smith","Surgeon");
        doc.printInfo();
        Doctor doc1= new Doctor("John","Smith");
        doc1.printInfo();
        doc1.speciality="Dermatology";
        doc1.printInfo();
        System.out.println("Changing value of static variable");
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("-----------------");
        doc1.hospital="Best Hospital";
        doc.printInfo();
        doc1.printInfo();
        /*variables

        optional                            must           must
        access mod/non a access modifier ----data Type--- name;

        Methods

        optional                              must       must
         access mod/non a access modifier ---returnType ---name
         from the more restrictive
         protected

         */
    }
}
