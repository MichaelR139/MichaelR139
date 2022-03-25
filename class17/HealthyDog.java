package com.syntax.class17;

public class HealthyDog
{

        String name;
        String color;
        static int numberOfLegs;

        void eat(){
            int noOfTime=3;
            System.out.println(name+" eats "+noOfTime);
        }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();
    }
}
