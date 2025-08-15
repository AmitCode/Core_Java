package com.opps.Constructors;
/*
CopyConstructor: Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.
Note: In Java,there is no such inbuilt copy constructor available like in other programming languages such as C++, instead we can create our own copy constructor by passing the object of the same class to the other instance(object) of the class.
*/
public class CopyConstructor implements Cloneable {
    int num1, num2;
    CopyConstructor(int a, int b){
        this.num1=a;
        this.num2 = b;
    }

    CopyConstructor(CopyConstructor copyConstructor){
        System.out.println("Copy CopyConstructor!...");
        this.num1 = copyConstructor.num1;
        this.num2 = copyConstructor.num2;
    }
    //Not Useful
    /*CopyConstructor(CopyConstructor copyConstructor) throws CloneNotSupportedException {
        System.out.println("Copy CopyConstructor!...");
        copyConstructor.clone();
    }*/

    /*Output:
    mainConstructor.num1: 20 mainConstructor.num2: 40
    Copy CopyConstructor!...
    copyConstructor.num1: 0 copyConstructor.num2: 0*/

    public static void main(String[] args) throws CloneNotSupportedException {
        CopyConstructor mainConstructor = new CopyConstructor(20,40);
        System.out.println("mainConstructor.num1: " + mainConstructor.num1 + " mainConstructor.num2: " +mainConstructor.num2);
        CopyConstructor copyConstructor = new CopyConstructor(mainConstructor);
        System.out.println("copyConstructor.num1: " + copyConstructor.num1 + " copyConstructor.num2: " +copyConstructor.num2);
    }
}
