package com.syntax.class24;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Makinga phone call");

    }void sendText(){
        System.out.println("Sending text");
    }
   abstract void displayPicture();
abstract void unlock();
    }

 class Iphone extends Phone{

    @Override
     void displayPicture(){
        System.out.println("Use photo app");
    }

     @Override
     void unlock() {
         System.out.println("Can use fase");

     }
 }
class Samsung extends Phone {
    @Override
    void displayPicture() {
        System.out.println("Use gallery app");
    }

    @Override
    void unlock() {
        System.out.println("Unlock");
    }
}
