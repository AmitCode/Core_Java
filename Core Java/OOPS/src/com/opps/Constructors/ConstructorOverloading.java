package com.opps.Constructors;
/*
Sometimes there is a need of initializing an object in different ways.
This can be done using constructor overloading.
*/
public class ConstructorOverloading {
    int param1,param2;
    ConstructorOverloading(){
        System.out.println("Default Constructor is Called!...");
    }

    ConstructorOverloading(int num1, int num2){
        System.out.println("Overloaded Constructor is Called with 2 parameters!...");
        this.param1 = num1;
        this.param2 = num2;

    }

    public static void main(String[] args){
        ConstructorOverloading defaultConstructor = new ConstructorOverloading();
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(10,20);
    }
}
