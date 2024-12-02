package com.takingInput.ScannerClass.nextBooleanMethod.Exceptions;

import java.util.Scanner;
//2-> NoSuchElementException
public class nextBooleanNoSuchElementException {
    public static void main(String args[]){
        System.out.println("nextBoolean() Method InputMismatchException!...");
        //1-> java.util.InputMismatchException
        String strs = "Amit";
        Scanner scan = new Scanner(strs);
        for (int i = 0; i < 2; i++) {
            // if the next is a Boolean,
            // print found and the Boolean
            if (scan.hasNextBoolean()) {
                System.out.println("Found Boolean value :"
                        + scan.nextBoolean());
            }
            // if no Boolean is found,
            // print "Not Found:" and the token
            else {
                System.out.println("Not found Boolean value :"
                        + scan.next());
            }
        }
        //Occurs when no input is there for scanning
//        Exception in thread "main" java.util.NoSuchElementException
//        at java.util.Scanner.throwFor(Scanner.java:862)
//        at java.util.Scanner.next(Scanner.java:1371)
//        at com.takingInput.ScannerClass.nextBooleanMethod.Exceptions.nextBooleanNoSuchElementException.main(nextBooleanNoSuchElementException.java:22)
    }
}
