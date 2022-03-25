package com.syntax.review07;

public class ObjectAndClassPracrice {
    String empName="Tarik";
    int empID=12345;
    String group;

    void emploeeDetails(){
        System.out.println("This method shows the detauls of the emploee");

    }
void employeeGroup(){
    System.out.println("This method shows the group of the employee");
}

    public static void main(String[] args) {
        ObjectAndClassPracrice obj=new ObjectAndClassPracrice();
        obj.employeeGroup();
        obj.emploeeDetails();

    }


}
