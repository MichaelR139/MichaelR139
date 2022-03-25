package com.syntax.class24;

public class ComputerT {
    public static void main(String[] args) {
        Computer[]t={new Apple(),new Lenovo(),new Hp(),new Dell()};
        for(Computer r:t){
            r.signIn();
            r.restart();
            r.oS();
            r.signUp();

        }
    }
}
