package com.opps.Constructors;
/*
DefaultConstructor:A constructor that has no parameters is known as default the constructor.
A default constructor is invisible.
And if we write a constructor with no arguments, the compiler does not create a default constructor
It is being overloaded and called a parameterized constructor.
The default constructor changed into the parameterized constructor.But Parameterized constructor can’t change the default constructor.
Default constructor provides the default values to the object like 0, null, etc. depending on the type.
*/
public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("DefaultConstructor is called!...");
    }

    public static void main(String[] args){
        System.out.println("This is a DefaultConstructor!....");
        DefaultConstructor defaultConstructor = new DefaultConstructor();
    }
}
