package com.opps.methods.MethodOverriding;
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//Method overriding is used for runtime polymorphism
//Rules:->
//The method must have the same name as in the parent class
//The method must have the same parameter as in the parent class.
//There must be an IS-A relationship (inheritance).
public class MethodOverriding{

    public void printMessage(String message){
        System.out.println("This is printMessage() of Parent Class!...");
        //return "Returned Message!...";
    }

    public static void main(String [] args){
        System.out.println("Method Overriding!...");
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.printMessage("This is Message!...");
        MethodOverriding subClass = new SubClass();
        subClass.printMessage("Message!...");

       /* SubClass subClass1 = new SubClass();
        subClass1.printMessage("My Message!...");*/
    }
}

class SubClass extends MethodOverriding{
    @Override
    public void printMessage(String message){
        System.out.println("This is printMessage() of Child Class!...");
        //return "Returned Message!...";
    }
}

//class OverridingMainMethod{
//    //1. Static methods cannot be annotated with @Override
//Why:It is because the static method is bound with class whereas instance method is bound with an object.
// Static belongs to the class area, and an instance belongs to the heap area.

//    @Override
//    public static void main(String[] args){
//
//    }
//}

//Class/Method Area: The class method area is the memory block that stores the class code, variable code(static variable, runtime constant), method code, and the constructor of a Java program.
// (Here method means the function which is written inside the class).
// It stores class-level data of every class such as the runtime constant pool, field and method data, the code for methods.
//Heap Area: The Heap area is the memory block where objects are created or objects are stored. Heap memory allocates memory for class interfaces and arrays (an array is an object).
// It is used to allocate memory to objects at run time.
//Note: Static Methods and Variables were previous stored in Class Area (Till Java 8). But, in current versions of Java static variables and methods are stored in Heap Memory.
//2.Final methods can not be overridden
//3. Private methods can not be overridden
//3. The overriding method must have the same return type (or subtype)