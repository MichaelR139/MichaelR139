package com.syntax.class21;

public class Task2 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
}

class Shape {
    double radius;

    public Shape(double radius) {

        this.radius = radius;
    }
}

class Circle extends Shape {
    double p;

    public Circle(double radius, double p) {
        super(radius);
        this.p = p;
    }

    void calcul() {
        System.out.println("area of circle " + (p * (radius * radius)));
        //Math.PI*Math.pow(radius,2) same
    }

    public static void main(String[] args) {
        Circle r = new Circle(3.14, 9.0);
        r.calcul();
    }
}


