package com.takingInput.ScannerClass.nextBooleanMethod.Exceptions;

import java.util.Scanner;
//3-> IllegalStateException
public class nextBooleanIllegalStateException {
    public static void main(String args[]){
        System.out.println("nextBoolean() Method InputMismatchException!...");
        //1-> java.util.InputMismatchException
        String strs = "TRUE";
        Scanner scan = new Scanner(strs);
        System.out.println("Scanned Data " +scan.nextBoolean());
        scan.close();
        System.out.println("Scanned Data" +scan.nextBoolean());

//        Occurs when Scanner is closed
//        Exception in thread "main" java.lang.IllegalStateException: Scanner closed
//        at java.util.Scanner.ensureOpen(Scanner.java:1070)
//        at java.util.Scanner.next(Scanner.java:1465)
//        at java.util.Scanner.nextBoolean(Scanner.java:1782)
//        at com.takingInput.ScannerClass.nextBooleanMethod.Exceptions.nextBooleanIllegalStateException.main(nextBooleanIllegalStateException.java:13)

    }
}
