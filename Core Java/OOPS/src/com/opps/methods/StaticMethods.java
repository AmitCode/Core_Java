package com.opps.methods;

//Method with static keyword.
//Belongs to class not to instance of class.
//No need to create the object/instance of class for invoking the static methods.
//No need to write ClassName.methodName(args) name for invoking the static methods within the class and its subClass where it is defined.
//but apart from those need to write this ClassName.methodName(args).
//We can access outside the package using this ---> className.Method
//The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it
//They are stored in the Permanent Generation space of heap as they are associated with the class in which they reside not to the objects of that class.
//But their local variables and the passed argument(s) to them are stored in the stack.
public class StaticMethods {
    public static void display(){

        System.out.println("This is a Static Method!...");
    }
    public static void main(String[] args){
        System.out.println("StaticMethods in Java!...");
        StaticMethods.display();
        display();
        SubClass subClass = new SubClass();
        subClass.displayOfSubClass();
        NotSubClass notSubClass = new NotSubClass();
        notSubClass.message();
    }
}

class SubClass extends StaticMethods{
    public void displayOfSubClass(){
        System.out.println("Inside SubClass!...");
        display();
    }
//    Static methods can not be overridden, since they are resolved using static binding by the compiler at compile time
//    @Override
//    public static void display(){
//
//        System.out.println("This is a Static Method!...");
//    }
    //This is MethodHiding
        public static void display(){
        System.out.println("This is a Static Method!...");
    }
}

class NotSubClass {

    public void message(){
        //Not the Way..
        //display();
        //The Way..
        System.out.println("Not inside SubClass!...");
        StaticMethods.display();
    }
}


