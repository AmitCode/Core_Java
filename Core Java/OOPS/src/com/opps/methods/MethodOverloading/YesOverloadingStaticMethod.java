package com.opps.methods.MethodOverloading;

public class YesOverloadingStaticMethod {
    public static void message(){
        System.out.println("static message() method with one argument!...");
    }
    public static void message(String message){
        System.out.println("static message() method with one argument message!...");
    }

    public static void main(String[] args){
        System.out.println("Overloading Static methods!...");
        YesOverloadingStaticMethod objects = new YesOverloadingStaticMethod();
        objects.message();
        objects.message();
    }
}
