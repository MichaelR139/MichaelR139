package com.syntax.rewiew10;

import com.syntax.rewiew09.Doctor;

public class AHospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Volcan","Dereli");
        doc.printInfo();//only public available
       // Doctor.work();-protected
    }
}
