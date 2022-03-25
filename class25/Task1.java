package com.syntax.class25;

public class Task1 {



    class Computer{


    //HW 24
    String make;
    Computer(String make){
        this.make=make;
    }
    void login(){
        System.out.println("Use user name");
    }
    class Apple extends Computer{
        public Apple(String make) {
            super(make);
        }

        @Override
        void login() {
            System.out.println("Hello");
        }
    }






    }
}

