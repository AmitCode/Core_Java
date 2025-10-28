package com.opps.methods;
//Any non-static method in a class is an instance method.
//These methods belong to the instance of a class.
//To invoke them we need to create the object/instance of class anywhere we want to access them.
//Instance method(s) belong to the Object of the class, not to the class i.e. they can be called after creating the Object of the class.
//These methods are stored in PermGen(Permanent Generation Space (Keeps track of loaded class metadata)) heap till java 7 but from java 8
//they are stored in metaspace heap(used to hold class metadata and is meant to dynamically resize based on the application's demands).
//The parameters, local variable and data returned by the method are stored in stack.

public class InstanceMethods {
    public void display(){
        System.out.println("This is a instance method!...");
    }

    public static void main(String[] args){
        System.out.println("InstanceMethods!...");
        InstanceMethods instanceMethods = new InstanceMethods();
        instanceMethods.display();
    }
}
