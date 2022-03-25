package com.syntax.class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website "+websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the  GoogleChrome browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website "+websiteLink+"in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the  Firefox browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website "+websiteLink+"in Firefox");
    }
    void testThePage(){
        System.out.println("Testing the in Firefox");
    }
    void closeBrowser(){
        System.out.println("Closing the Firefox browser");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening the  IE browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website "+websiteLink+"in IE");
    }
    void testThePage(){
        System.out.println("Testing the in IE");
    }
    void closeBrowser(){
        System.out.println("Closing the IE browser");
    }
}
