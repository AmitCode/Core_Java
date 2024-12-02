package com.opps.methods;

public class MethodsWithAccessModifiers {
    //Accessible anywhere
    public void publicMethods(){
        System.out.println("publicMethods!...");
    }

//    It is accessible only within the class in which it is defined.
    private void privateMethods(){
        System.out.println("publicMethods!...");
    }

//    It is accessible within the class in which it is defined and in its subclasses.
    protected void protectedMethods(){
        System.out.println("protectedMethods!...");
    }
//    It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.
    void defaultMethods(){
        System.out.println("defaultMethods!...");
    }

    //Refer MethodClass and Main class for Example More.

    public static void main(String[] args){
        MethodsWithAccessModifiers obj = new MethodsWithAccessModifiers();
        obj.privateMethods();
        System.out.println("MethodsWithAccessModifiers!...");
        SubClassOfAbove checkModifier = new SubClassOfAbove();
        checkModifier.checkModifier();
    }
}

class SubClassOfAbove extends MethodsWithAccessModifiers{
    MethodsWithAccessModifiers methods = new MethodsWithAccessModifiers();
    public void checkModifier(){
        System.out.println("SubClassOfAbove.checkModifier!...");
        //Not Accessible any subclass.
        //Error: 'privateMethods()' has private access in 'com.opps.methods.MethodsWithAccessModifiers'
        methods.defaultMethods();
        //methods.privateMethods();
        methods.protectedMethods();
        methods.defaultMethods();
    }
}
