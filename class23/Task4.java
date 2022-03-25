package com.syntax.class23;

public class Task4 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.

     */
    public static void main(String[] args) {

        Masters masters = new Masters();
        masters.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
    }


}
