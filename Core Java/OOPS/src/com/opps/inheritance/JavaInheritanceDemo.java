package com.opps.inheritance;

public class JavaInheritanceDemo {
    String myName;
    public void print(){
        System.out.println("This is Super/Base/Parent Class!...");
    }

    public JavaInheritanceDemo(String name){
        System.out.println("Calling super class constructor!...");
        this.myName= name;
    }

    public JavaInheritanceDemo() {
    }
}

class BaseClassDemo extends JavaInheritanceDemo{
    String myNewName;
    public BaseClassDemo(String name1, String name2){

        super(name1);//super() method must be the first statement of the subclass constructor.
        //If we are not writing anything here the by default java will call super class constructor.

        System.out.println("Calling base class constructor!...");
        this.myNewName = name2;
        //super.myName = name2;
        //myName = name2;Both statement are same.
    }

    public void baseClassMethod(){
        System.out.println("This is Subclass/Child Class");
    }

    public static void main(String[] args) {
        BaseClassDemo baseClassDemo = new BaseClassDemo("Amit Kumar Pandey","Aman Kumar Pandey");
        System.out.println("Name Parent:" +baseClassDemo.myName);
        System.out.println("Name Base:" +baseClassDemo.myNewName);
        baseClassDemo.baseClassMethod();
        baseClassDemo.print();
    }
}
