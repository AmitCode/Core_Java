package com.opps.methods;
//Binding:Connecting a method call to the method body is known as binding.
//There are two types of method binding in java.
//1.Static/Early Binding 2. Dynamic/Late Binding
//StaticOrEarly Binding:private, final and static members (methods and variables) use static binding while for virtual methods (In Java methods are virtual by default) binding is done during run time based upon the run time object.
//The static binding uses Type information for binding.
//Overloaded methods are resolved (deciding which method to be called when there are multiple methods with the same name) using static binding
//The binding which can be resolved at compile time by the compiler is known as static or early binding. The binding of all the static, private, and final methods is done at compile-time.
//Static Binding: Happens at compile time.
//It is performed based on the type of reference variable, rather than the object that it refers to
//Mainly it is used when the method is defined in the class and there is no overriding of the method in the subclass.
public class StaticOrEarlyBinding {
   static class SuperClass{
        public void displayMessage(){
            System.out.println("This displayMessage is belongs to super class!...");
        }
    }

    static class SubClass extends SuperClass{
        public void displayMessage(){
            System.out.println("This displayMessage is belongs to sub class!...");
        }
    }

    public static void main(String[] args){
        //We can't create the instance of non-static class here as the main method is static
        //Error: 'com.opps.methods.StaticOrEarlyBinding.this' cannot be referenced from a static context
        //Creating instance of SuperClass with the reference of SuperClass
        SuperClass superClass = new SuperClass();
        //Creating instance of SuperClass with the reference of SubClass
        SuperClass subClass = new SubClass();

        superClass.displayMessage();
        subClass.displayMessage();
    }
}
