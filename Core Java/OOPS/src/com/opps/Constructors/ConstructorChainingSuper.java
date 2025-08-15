package com.opps.Constructors;

class BaseClass{
    String myName;
    public BaseClass(){
        System.out.println("Calling Default Constructor of Base Class!...");
    }

    public BaseClass(String name){
        this.myName = name;
        System.out.println("Calling Parameterized Constructor of Base Class!...");
    }
}
public class ConstructorChainingSuper extends BaseClass{
    String myName;
    public ConstructorChainingSuper(){
        System.out.println("Calling Default Constructor of ConstructorChainingSuper!...");
    }

    public ConstructorChainingSuper(String name){
        super(name);
        this.myName = name;
        System.out.println("Calling Default Constructor of ConstructorChainingSuper!...");
    }

    public static void main(String[] args){
        System.out.println("Constructor Chaining to other class using super() keyword :");
        ConstructorChainingSuper superKey = new ConstructorChainingSuper();
        ConstructorChainingSuper superKey1 = new ConstructorChainingSuper("Amit");
    }

}
