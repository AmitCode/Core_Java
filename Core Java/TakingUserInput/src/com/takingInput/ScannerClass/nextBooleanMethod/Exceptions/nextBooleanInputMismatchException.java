package com.takingInput.ScannerClass.nextBooleanMethod.Exceptions;

import java.util.Scanner;

public class nextBooleanInputMismatchException {
    public static void main(String args[]){
        System.out.println("nextBoolean() Method InputMismatchException!...");
        //1-> java.util.InputMismatchException
        String strs = "Amit GEEKS 0 True 1 7 False";
        Scanner scan = new Scanner(strs);
        while(scan.hasNext()){
                System.out.println("Found value: " +scan.nextBoolean() +" is a Boolean");
        }
        //Occurs where found non-boolean value
//        Exception in thread "main" java.util.InputMismatchException
//        at java.util.Scanner.throwFor(Scanner.java:864)
//        at java.util.Scanner.next(Scanner.java:1485)
//        at java.util.Scanner.nextBoolean(Scanner.java:1782)
//        at com.takingInput.ScannerClass.nextBooleanMethod.Exceptions.nextBooleanInputMismatchException.main(nextBooleanInputMismatchException.java:12)

    }
}
