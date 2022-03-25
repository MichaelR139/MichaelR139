package com.syntax.class18;

public class Account {
   private String userName="Teyf";
   private String password="Admin";
   public String accountNumber="123456";
   private double balance=1500;

   private void printUserName() {
       System.out.println(userName);
   }
   protected void  printPassword(){
        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public  void printAccountNumber(){
        System.out.println(accountNumber);
    }
    Account r=new Account();


}
