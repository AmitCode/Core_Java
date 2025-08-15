package com.opps.Interfaces;
/*An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class
The interface in Java is a mechanism to achieve Abstraction and Multiple Inheritances.
There can be only abstract methods in the Java interface, not the method body.
Interfaces can have abstract methods and variables.
interface keyword will be used to define Interfaces.
It is used to provide total abstraction.
All the methods in an interface are declared with an empty body and are public and all fields are public, static, and final by default
A class must use implements keyword if it is implementing the methods of
A class can extend another class similar to this an interface can extend another interface.
But only a class can extend to another interface, and vice-versa is not allowed
*/

public class JavaInterface implements AJavaInterface {
    public void display(){
        System.out.println("implementing display() method of AJavaInterface interface!...");
    }

    public static void main(String[] args){
        System.out.println("Java Interface!...");
        JavaInterface javaInterface = new JavaInterface();
        javaInterface.display();
    }
}

interface AJavaInterface{
    final int a=10;
    void display();
}
