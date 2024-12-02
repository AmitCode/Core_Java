package com.takingInput.ScannerClass.nextDoubleMethod;

import java.util.Scanner;

public class nextDoubleMethod {
    public static void main(String[] args){
        System.out.println("nextDoubleMethod()!...");
        String strs = "Geeks 23.09 House 890.334 757 True";
        Scanner scan = new Scanner(strs);
        while(scan.hasNext()){
            if(scan.hasNextDouble()){
                System.out.println("Found value " +scan.nextDouble() + " is a Double Value");
            }else{
                System.out.println("Found value " +scan.next() + " is not a Double Value");
            }
        }
//        Found value Geeks is not a Double Value
//        Found value 23.09 is a Double Value
//        Found value House is not a Double Value
//        Found value 890.334 is a Double Value
//        Found value 757.0 is a Double Value
//        Found value True is not a Double Value
//        Exceptions
//        InputMismatchException: if the next token does not matches the Double regular expression, or is out of range
//        NoSuchElementException: throws if input is exhausted
//        IllegalStateException: throws if this scanner is closed
    }
}
