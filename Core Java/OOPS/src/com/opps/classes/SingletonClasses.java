package com.opps.classes;

/*In object-oriented programming, a java singleton class is a class that can have only one object (an instance of the class) at a time.
After the first time, if we try to instantiate the Java Singleton classes, the new variable also points to the first instance created
The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one.
We can use this single object repeatedly as per the requirements. This is the reason why multi-threaded and database applications mostly make use of the Singleton pattern in Java for caching, logging, thread pooling, configuration settings, and much more.
For example, there is a license with us, and we have only one database connection or suppose our JDBC driver does not allow us to do multithreading, then the Singleton class comes into the picture and makes sure that at a time, only a single connection or a single thread can access the connection.
*/

/*How to Design/Create a Singleton Class in Java?
To create a singleton class, we must follow the steps, given below:
1. Ensure that only one instance of the class exists.
2. Provide global access to that instance by
Declaring all constructors of the class to be private.
Providing a static method that returns a reference to the instance. The lazy initialization concept is used to write the static methods.
The instance is stored as a private static variable.*/

/*Forms of Singleton Class Pattern
There are two forms of singleton design patterns, which are:
Early Instantiation: The object creation takes place at the load time.
Lazy Instantiation: The object creation is done according to the requirement.*/
public class SingletonClasses {
    public static void main(String[] args){
        System.out.println("Singleton Class Example!...");
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
    }
}

class SingletonClass{
    private static SingletonClass singletonClass = null;
    private SingletonClass(){
        System.out.println("Singleton Class private constructor is called!...");
    }

    public static SingletonClass getInstance(){
        System.out.println("Calling Singleton Class private constructor to instantiate Singleton Class !... ");
        singletonClass = ( singletonClass != null ? singletonClass : new SingletonClass());
        return singletonClass;
    }
}
