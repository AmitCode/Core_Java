package com.opps.Constructors;
/*
ParameterizedConstructor: A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with our own values, then use a parameterized constructor.
*/
public class ParameterizedConstructor {
    int a,b;
    ParameterizedConstructor(int num1, int num2){
        this.a = num1;
        this.b = num2;
        return;
    }
    public void printData(){
        System.out.println("a: " +this.a + " b: " +this.b);
    }

    public static void main(String[] args){
        System.out.println("ParameterizedConstructor!...");
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(10,20);
        parameterizedConstructor.printData();
    }
}