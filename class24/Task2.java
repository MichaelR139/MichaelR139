package com.syntax.class24;

abstract class File{
   abstract void open();

        void edit(){
            System.out.println("Editing a class");
        }
        void close(){
            System.out.println("closing the class");
        }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Use inteiiige");
    }
}
class PDFFile extends File{
    @Override
    void open() {
        System.out.println("Use Adope");
    }
}
public class Task2 {
    public static void main(String[] args) {

        File [] files= {new JavaFile(),new PDFFile()};
        for(int i=0;i< files.length;i++){
            files[i].open();
            files[i].edit();
            files[i].close();



            }
        }
    }
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile,
     WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open
     .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */


