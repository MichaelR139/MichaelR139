package com.syntax.class25;

public class Car1 {
    /*
    2.	Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which
     should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation
of  calculateSalePrice() method in which returned price calculated as following:
 if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of
 calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
 otherwise 10% discount
     */
    double carPrice;
    String color;
    void calculateSalePrice(){
        System.out.println(carPrice);
    }

    public Car1(double carPrice,String color) {
        this.carPrice = carPrice;
        this.color=color;
    }
}
class Sedan extends Car1{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    void calculateSalePrice() {
        super.calculateSalePrice();
        if(length>20){
            System.out.println("car price should include 5% discount");
        }else{
            System.out.println("otherwise 10% discount");
        }
    }
}
class Truck extends Car1{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    void calculateSalePrice() {
        super.calculateSalePrice();
        if (weight>2000){
            System.out.println("price car should include 10% discount");
    }else{
            System.out.println("price car should include  20% discount");
        }
}
}
