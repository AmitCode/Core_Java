package com.opps.Interfaces.TypesOfInterface;
/*
A Functional Interface is an interface that can only have one abstract method.
Functional Interface is additionally recognized as Single Abstract Method Interfaces.
They are also known as SAM interfaces.
From Java 8 lambda expression can be used to represent the instance of Functional Interface.
A functional interface can have any number of default methods.
Runnable, ActionListener, and Comparable are some of the examples of functional interfaces.
the compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterface annotation is present on the interface declaration.
*/
@java.lang.FunctionalInterface
interface ExampleFunctionalInterface{
    public void printMessage();
    //public void printMessageNew();
}
public class FunctionalInterface{
    public static void main(String[] args){
        ExampleFunctionalInterface exampleFunctionalInterface = () -> System.out.println("This is a FunctionalInterface");
        ExampleFunctionalInterface exampleFunctionalInterface1 = () -> System.out.println("My name is Amit Kumar Pandey");
        exampleFunctionalInterface.printMessage();
        exampleFunctionalInterface1.printMessage();

        ExampleFunctionalInterface exampleFunctionalInterface2= () -> {int a = 0, b=10;
        System.out.println("A: "+a + " B: "+b+ " And A+B: " +(a+b));
        };
        exampleFunctionalInterface2.printMessage();
    }

}
