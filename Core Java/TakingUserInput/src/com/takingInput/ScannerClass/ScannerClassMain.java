package com.takingInput.ScannerClass;

import java.util.Scanner;

public class ScannerClassMain {
    public  static void main(String[] args){
        System.out.println("Here I am!...");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int scannedInt = scan.nextInt();
        System.out.print("Scanned Input is: "+scannedInt);
    }
}
