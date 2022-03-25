package com.syntax.class23;
 class CreditCard{
     double balance;
     double interest;

     public CreditCard(double balance, double interest) {
         this.balance = balance;
         this.interest = interest;
     }

     void calculateInterest(){
         System.out.println(balance*interest);
     }

 }
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance*interest)+2);
    }
}

class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        System.out.println((balance*interest)+1);
    }
}



public class Task5 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.

Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,15);
        creditCard.calculateInterest();
        CreditCard r=new AX(23,45);
        r.calculateInterest();
    }
}


