package com.opps.Constructors;
/*
If it’s made private, then it can only be accessible inside the class.
if a constructor is declared private, we are not able to create an object of the class.
The main purpose of using a private constructor is to restrict object creation.
It can also be used to create singleton classes.
*/
public class PrivateConstructors {
    public static void main(String[] args){
       /* Error: 'ClassWithPrivateConstructor()' has private access in 'com.opps.Constructors.ClassWithPrivateConstructor'
        ClassWithPrivateConstructor constructors = new ClassWithPrivateConstructor();*/
        System.out.println("Private Constructor!...");
        ClassWithPrivateConstructor constructors = ClassWithPrivateConstructor.getClassInstance();
        constructors.display();
    }
}

class ClassWithPrivateConstructor{
    //PrivateConstructors class will not be able to create the instance of This class.
    private ClassWithPrivateConstructor(){
        System.out.println("ClassWithPrivateConstructor() invoked to create the instance of class!...");
    }

    /*Now to create the instance of this class we need create a method the will call this private
    constructor and will return the instance if this class*/
    static ClassWithPrivateConstructor classWithPrivateConstructor;
    public void display(){
        System.out.println("Private Constructor invoked successfully!...");
    }
    public static ClassWithPrivateConstructor getClassInstance(){
        System.out.println("Invoking ClassWithPrivateConstructor() to create the instance of class!...");
        classWithPrivateConstructor = (classWithPrivateConstructor != null ? classWithPrivateConstructor : (new ClassWithPrivateConstructor()));
        return classWithPrivateConstructor;
    }
}
