package com.takingInput.ScannerClass.nextByteMethod;

import java.util.Scanner;

public class nextByteMethod {
    public static void main(String[] agrs){
        System.out.println("nextByteMethod()!...");

        String strs = "Amit 0 24 25 9 10 56.89 X";
        Scanner scan = new Scanner(strs);
        //Without parameter
//        while(scan.hasNext()){
//            if(scan.hasNextByte()){
//                System.out.println("Found value " + scan.nextByte() + " is Byte Value!..");
//            }else{
//                System.out.println("Found value " + scan.next() + " is not Byte Value!..");
//            }
//        }
        //With Parameter
        while(scan.hasNext()){
            if(scan.hasNextByte()){
                System.out.println("Found value " + scan.nextByte(36) + " is Byte Value!..");
            }else{
                System.out.println("Found value " + scan.next() + " is not Byte Value!..");
            }
        }
//        Exceptions: The function throws three exceptions as described below:
//
//        InputMismatchException: if the next token does not matches the Byteeger regular expression, or is out of range
//        NoSuchElementException: throws if input is exhausted
//        IllegalStateException: throws if this scanner is closed
    }
}
