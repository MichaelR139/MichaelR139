package com.syntax.class24;

public abstract class Computer {
    public void signIn() {
        System.out.println("Computer is signin");
    }

    public void signUp() {
        System.out.println("Computer is signup");
    }

    void restart() {
        System.out.println("Restart Apple");
    }

    abstract void oS();
}

class Apple extends Computer {

    public void signIn() {
        System.out.println("Apple is signin");
    }

    void oS() {
        System.out.println("Opera");
    }

    void restart() {
        System.out.println("Restart Apple");
    }
}

class Lenovo extends Computer {

    public void signIn() {
        System.out.println("Lenovo is signin");
    }
    void oS() {
        System.out.println("FireFox");
    }
    void restart() {
        System.out.println("Restart Lenovo");
    }
}
class Hp extends Computer {

    public void signIn() {
        System.out.println("Hp is signin");
    }
    void oS() {
        System.out.println("Windows");
    }
    void restart() {
        System.out.println("Restart Hp");
    }
}
class Dell extends Computer {
    public void signIn() {
        System.out.println("Dell is signin");
    }
    void oS() {
        System.out.println("Opera,Windows");
    }
    void restart() {
        System.out.println("Restart Dell");
    }
}