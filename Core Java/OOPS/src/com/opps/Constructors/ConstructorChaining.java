package com.opps.Constructors;
/*
Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means of constructor overloading) and make code more readable.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in the same class
From base class: by using super() keyword to call the constructor from the base class.
*/
public class ConstructorChaining {
    public static void main(String[] args){
        System.out.println("Constructor Chaining!...");
        ChainingClass chainingClass = new ChainingClass();
    }
}

class ChainingClass{
    int param1, param2;
    public ChainingClass(){
        this(5);
        System.out.println("Default Constructor Called!...");
        //Error: Call to 'this()' must be first statement in constructor body
        //this(5);
    }

    public ChainingClass(int var1){
        this(5,6);
        this.param1 = var1;
        System.out.println("Calling ChainingClass(int var1)");
    }

    public ChainingClass(int num1, int num2){
        System.out.println("Calling ChainingClass(int num1, int num2)");
    }
}

/*
Rules of constructor chaining :
The this() expression should always be the first line of the constructor.
There should be at least be one constructor without the this() keyword (constructor 3 in above example).
Constructor chaining can be achieved in any order.
*/
