package com.syntax.class24;

public interface Emploee {
    public void work();

    public static final int age = 10;
}
class Tester implements Emploee{


    @Override
    public void work() {

    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Emploee.age);
    }
}

