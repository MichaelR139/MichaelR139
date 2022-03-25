package com.syntax.class22;

public class HW1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle S = a × b, где S — площадь; a, b — длина и ширина.
Square  S = a × a = a2, где S — площадь, a — сторона
Box  S=2lw+2lh+2wh
l – длина коробки (самое длинное ребро).
h – высота коробки.
w – ширина коробки.

:+1::+1::skin-tone-2:2


Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
:+1::+1::skin-tone-2:
2 */
    static void area( double length,double width){
        double a=(length*width);
        System.out.println("Rectangle "+a);
    }
    static void area(double width){
        System.out.println("Square " +width);
    }
    static void area(double lenght,double width,double height){
        System.out.println("Box "+lenght*width*height);
    }


    public static void main(String[] args) {
area(12,33);
area(4);
area(4,6,8);



    }



}