package com.syntax.class21;

public class SuperDemo1 {

}
class AAA{

        }
class BBB {
    String name;
    BBB() {

    }

    BBB(String name) {
        super();
        //this();  we cant use this super() and this() inside the same constr
        this.name=name;

    }
}