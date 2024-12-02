package com.opps.classes.ObjectCreation;

import java.lang.reflect.Method;

public class UsingNewInstanceMethod {
    public static void main(String[] args){
        System.out.println("Object creation using newInstance() method!...");
        try {
//            Part 1.1: Using Class.forName of object class.
//            Class cls = Class.forName("com.opps.classes.ObjectCreation.NewInstanceMethod");
//            NewInstanceMethod obj = (NewInstanceMethod)cls.newInstance();
//            Part 1.2
            NewInstanceMethod obj = (NewInstanceMethod)Class.forName("com.opps.classes.ObjectCreation.NewInstanceMethod").newInstance();
//              Object objectClass = Class.forName("com.opps.classes.ObjectCreation.NewInstanceMethod").newInstance();
//              System.out.println("Class Name: " +objectClass.getClass());
//              Class[] parameterType = null;
//              Method obj = objectClass.getClass().getMethod("message",parameterType);
//            obj.message();
//            Part 2: Using Class.forName of Constructor  class.

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            System.out.println("Exception: " +ex);
        }
    }
}

class NewInstanceMethod{
    public NewInstanceMethod(){
        System.out.println("NewInstanceMethod() constructor called!...");
    }
    public void message(){
        System.out.println("New Object is created!...");
    }
}
