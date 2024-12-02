package com.opps.methods;

public class MethodClass {
     public static void main(String[] args){
         System.out.println("MethodsWithAccessModifiers!...");
         MethodsWithAccessModifiers methods = new MethodsWithAccessModifiers();
         methods.publicMethods();
         //can not accessible here!...
         //Error: 'privateMethods()' has private access in 'com.opps.methods.MethodsWithAccessModifiers'
         //methods.privateMethods();
         methods.protectedMethods();
         methods.defaultMethods();
     }
}

