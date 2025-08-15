package com.opps.methods.MethodOverloading;
//Overloading: Method Overloading allows different methods to have the same name,
//but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
//Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
public class MethodOverloading {
    public void displayMessage(){
        System.out.println("This is Method Overloading!...");
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

    public void displayMessage(String message, int num){
        System.out.println("displayMessage with return type");
    }

    public static void main(String[] args){
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.displayMessage();
        methodOverloading.displayMessage("displayMessage() method with one argument message!...");
        methodOverloading.displayMessage("displayMessage() method with one argument message, num!...");
    }
}
