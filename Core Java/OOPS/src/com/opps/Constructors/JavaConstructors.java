package com.opps.Constructors;

/*Constructors: A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes.*/
/*
Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
Constructors do not return any type while method(s) have the return type or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
*/
public class JavaConstructors {
    public JavaConstructors(){
        System.out.println("Constructor called!... ");
    }

    public static void main(String[] var){
        System.out.println("Constructors in Java!...");
        JavaConstructors obj = new JavaConstructors();
    }


}

/*
Note: It is not necessary to write a constructor for a class.
It is because the java compiler creates a default constructor (constructor with no arguments) if your class doesn’t have any.
*/
//A constructor in Java can not be abstract, final, static, or Synchronized.

