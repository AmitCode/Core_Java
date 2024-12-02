package com.opps.classes;

import java.lang.reflect.Method;

//A class is static if it is declared by static modifier.
//Only nested/inner class can be created as static.
//If will we do this error will be static is not allowed here.
//Here only 'nestedClass' can be static.
public class StaticClass {
    public static class NestedClass{
        public static void main(String[] agrs){
            System.out.println("nestedClass class main!...");
        }
        public static void checkStatic(){
            System.out.println("By default static method!...");
        }
    }


    public static void main(String[] args){
        System.out.println("Main class main");
        String a[] = new String[2];
        a[0] = "amit";

        NestedClass.main(a);
    }

}
