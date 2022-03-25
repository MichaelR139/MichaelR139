package com.syntax.review07;

public class Practice4 {
    void verifyBatch12GoodEnough(boolean isGood){
        if(isGood){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }

    }

    public static void main(String[] args) {
        Practice4 p=new Practice4();
        p.verifyBatch12GoodEnough(true);
    }
}
