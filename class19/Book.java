package com.syntax.class19;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
  Instance variables are being initialized
  Both Constructors are being executed
     */
   private String name;
    private String author;
    private int age;

    public Book(String name,String author,int age){
    this.name=name;
    this.author=author;
    this.age=age;

}
public Book(int age){
    System.out.println("Age of this "+age);
}
    void printInfo(){
        System.out.println("Name of the book "+name+".Author of this book "+author);

}
}