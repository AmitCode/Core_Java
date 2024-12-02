package com.takingInput.ScannerClass.nextFloatMethod;

import java.util.Scanner;

public class nextFloatMethod {
    public static void main(String[] args){
        System.out.println("nextFloatMethod()!...");
        System.out.print("Enter a Float: ");
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        System.out.print("Entered Value is: " +x);
    }
}
