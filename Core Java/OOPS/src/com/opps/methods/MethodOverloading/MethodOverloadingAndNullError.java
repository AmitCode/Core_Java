package com.opps.methods.MethodOverloading;
//The reason why we get compile time error in the above scenario is, here the method arguments Integer and String both are not primitive data types in Java.
// That means they accept null values.
// When we pass a null value to the method1 the compiler gets confused which method it has to select, as both are accepting the null.
//This compile-time error wouldn’t happen unless we intentionally pass null value.
public class MethodOverloadingAndNullError {
    public void acceptArgs(String message){
        System.out.println("Message1 String!...");
    }

    public void acceptArgs(Integer num){
        System.out.println("Message2 num!...");
    }

    public static void main(String[] args){
        MethodOverloadingAndNullError object = new MethodOverloadingAndNullError();
        //Error: java: reference to acceptArgs is ambiguous
//        object.acceptArgs(null);
        //Error: java: reference to acceptArgs is ambiguous
//        object.acceptArgs(null);
        Integer x = null;
        String y = null;
        object.acceptArgs(x);
        object.acceptArgs(y);
    }
}
