package com.opps.Interfaces;

public interface JavaInterfaceEx1 {
    /* Error in case of method Body in interface-->
    Interface abstract methods cannot have body
    public void displayMessage(){

    }*/

    public void displayMessage();
}

class ImplementationClass implements JavaInterfaceEx1{
    public void displayMessage(){
        System.out.println("Implementing Java Interface!...");
    }

    public static void main(String[] args){
        System.out.println("Java Interface!...");
        ImplementationClass implementationClass = new ImplementationClass();
        implementationClass.displayMessage();
    }
}