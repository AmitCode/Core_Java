package com.opps.methods.MethodOverloading;

public class YesOverloadingMainMethod {
    public static void main(String args[]){
        System.out.println("Overloading Main Method");
        System.out.println("Main() method 1: public static void main(String args[])");
        YesOverloadingMainMethod obj = new YesOverloadingMainMethod();
        obj.main("");
    }

    public static void main(String args){
        System.out.println("Main() method 2: public static void main(String args)");
    }
}


