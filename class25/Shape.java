package com.syntax.class25;

public interface Shape {
    /*
    1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
    void calculateArea();
    void calculatePerimetr();
}
class Circle implements Shape{

    double radius;
    Circle(double radius){

        this.radius=radius;
    }
    @Override
    public void calculateArea() {
     double area=0;
     area= Math.PI*(radius*radius);
        System.out.println(area);
    }

    @Override
    public void calculatePerimetr() {
    double perimetr=0;
    perimetr=2*Math.PI*radius;
        System.out.println(perimetr);
    }
}
class Square implements Shape{
    double lehgth;
    double width;

    public Square(double lehgth,double width) {
        this.lehgth = lehgth;
        this.width=width;
    }

    @Override
    public void calculateArea() {
    double area= 4*lehgth;
        System.out.println(area);
    }

    @Override
    public void calculatePerimetr() {
     double perimetr=lehgth*width;
        System.out.println(perimetr);
    }
}
