package com.takingInput.ScannerClass.nextBooleanMethod;

import java.util.Scanner;
//True and false are only valid input for nextBoolean() method.
//Example--->below
//0 and 1 are also not a valid input.
//Found value: Amit is not a Boolean
//Found value: GEEKS is not a Boolean
//Found value: 0 is not a Boolean
//Found value: true is a Boolean
//Found value: 1 is not a Boolean
//Found value: 7 is not a Boolean
//Found value: false is a Boolean
public class nextBooleanMethod {
    public static void main(String args[]){
        System.out.println("nextBoolean() Method!....");
        //System.out.print("Enter a Boolean Value: ");

        //Taking input from user.
        //Scanner scan = new Scanner(System.in);
        //boolean scannedInput = scan.nextBoolean();
        //System.out.println("Scanned Input: " + scannedInput);
        //Scanning from another variable
        String strs = "Amit GEEKS 0 True 1 7 False";
        Scanner scan = new Scanner(strs);
        while(scan.hasNext()){
            if(scan.hasNextBoolean()){
                System.out.println("Found value: " +scan.nextBoolean() +" is a Boolean");
            }else{
                System.out.println("Found value: " +scan.next() +" is not a Boolean");
            }
        }
        //Exception
        //1-> java.util.InputMismatchException
        //2-> java.util.NoSuchElementException
        //3-> java.util.IllegalStateException
        //1->

    }
}
