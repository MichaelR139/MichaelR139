package com.syntax.class21;

public class Task1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
      Print users name, mobile number and address in userDetails method. Test your code.
     */
}
class User {
    String name;
    String mobileNumber;

    public User(String name,String mobileNumber) {
        this.name=name;
        this.mobileNumber = mobileNumber;

    }
}
 class UserInfo extends User{
    String adress;


    public UserInfo(String name, String mobileNumber, String adress) {
        super(name, mobileNumber);
        this.adress = adress;
    }

    void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+adress);
    }


}class Testers {
    public static void main(String[] args) {


        UserInfo r = new UserInfo("Michael", "343-90-89","Chrome.cr");
        r.userDetails();
    }
}