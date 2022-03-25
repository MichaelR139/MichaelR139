package com.syntax.class25;

abstract public class Marks {
    /*
    1.	We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
      in three subjects as its parameters and the marks in four subjects as its parameters for student B.
       Test your code
     */
    int math;
    int language;
    int computerSince;

    public Marks(int math,int language,int computerSince) {
        this.math = math;
        this.language=language;
        this.computerSince=computerSince;
    }

    public abstract void getPercentage();

    }
    class A extends Marks{
        public A(int math, int language, int computerSince) {
            super(math, language, computerSince);
        }

        @Override
        public void getPercentage() {
            int avrA=(math+language+computerSince)/3;
            System.out.println("Student A "+avrA);
        }
    }
    class B extends Marks{
    int history;
        public B(int math, int language, int computerSince,int history) {
            super(math, language, computerSince);
            this.history=history;
        }

        @Override
        public void getPercentage() {
            int avrB=(math+language+computerSince+history)/4;
            System.out.println("Student B "+avrB);
        }
    }

