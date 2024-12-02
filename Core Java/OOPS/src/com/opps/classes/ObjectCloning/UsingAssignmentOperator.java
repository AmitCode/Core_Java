package com.opps.classes.ObjectCloning;

import org.bouncycastle.util.test.Test;

//Unlike c++ we can't create a clone of object in java.
//In java if we do this it will return reference of it.
//That means if we will perform changes in clone/main object it will also reflect in clone/main object.
//Constructor will be called only once.
public class UsingAssignmentOperator {
    public static void main(String[] args){
        System.out.println("Object Cloning using Assignment Operator!...");
        Testing test1 = new Testing(23,23);
        System.out.println("Result Before Cloning: ");
        test1.displayAdd();

        Testing test2 = test1;
        System.out.println("Result After Cloning: ");
        test2.displayAdd();

        System.out.println("Result Before Cloning and Changing the data : ");
        test1.a = 10;
        test1.displayAdd();
        test2.displayAdd();
    }
}

class Testing{
    int a;
    int b;
    public Testing(int a, int b){
        System.out.println("Constructor Calling!...");
        this.a= a;
        this.b = b;
    }

    public void displayAdd(){
        System.out.println("Addition is: " +(a+b) + " ");
    }
}
