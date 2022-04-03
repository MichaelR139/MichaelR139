package com.syntax.rewiew09;

public class AnotherHospital {
    public static void main(String[] args) {
        //test accessability
        Doctor doc=new Doctor("Asel","Kiytova","Dermatology");
        doc.printInfo();//public m.
        doc.hello();//defoult m.
        Doctor.work();//protected m.
        //getPaid -private
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        System.out.println(doc.speciality);

    }
}
