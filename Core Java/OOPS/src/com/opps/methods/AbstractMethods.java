package com.opps.methods;
//A method declared with abstract keyword is an abstract method.
//Used to achieve Abstraction.
//The abstract Method is used for creating blueprints for classes or interfaces.
public class AbstractMethods extends DisplayMessageImpl {
    void displayMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args){
        AbstractMethods abstractMethods = new AbstractMethods();
        abstractMethods.displayMessage("This is the implementation of abstract method!...");
    }
}

abstract class DisplayMessageImpl {
    abstract void displayMessage(String message);
}
