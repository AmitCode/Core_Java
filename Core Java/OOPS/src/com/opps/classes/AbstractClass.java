package com.opps.classes;
//Abstract class can have abstract and non-abstract methods both.
//If any class is inheriting the abstract class then it needs to implement all abstract
// methods and if it is not implementing those methods it needs to be marked as abstract also
//then this responsibility will be for its next-level child class.
//We can create parent and child class both as abstract.
//class contains at least one abstract method then compulsory that we should declare the class as abstract
public abstract class AbstractClass {
    int x;
    public abstract void displayMessage(String message);
    //public abstract void nextMessage(String message);
    // We can define static methods in abstract class
    public static void abstractClass(){
        System.out.println("Abstract Class!...");
    }

//    Constructors are allowed.
    public AbstractClass(){
    }

    public AbstractClass(int x) {
        this.x = x;
    }

//    final method can not be abstract itself as it will yield an error:
//    “Illegal combination of modifiers: abstract and final”
//    final abstract void sum();Error:-> Illegal combination of modifiers 'abstract' and 'final
    final void finalMethod(){
        System.out.println("This is final Method!...");
    }
}

 class MainClass extends AbstractClass{
    public static void main(String[] args){
        System.out.println("Inside Main Class!...");
        //We are not allowed to create object Abstract Class.
        // AbstractClass abstractClass = new AbstractClass();
        //displayMessage();
        //But we can have reference to it line this.
        //Through this we can access the abstract method only.
        AbstractClass referenceToAbstract = new MainClass();
        referenceToAbstract.displayMessage("Referencing the Abstract Class!...");
        MainClass mainClassObject = new MainClass();
        String msg = "This is implementation of Abstract Class Method!...";
        mainClassObject.displayMessage(msg);

        //
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    //'finalMethod()' cannot override 'finalMethod()' in 'com.opps.classes.AbstractClass';
    // overridden method is final.
//    @Override
//    public void finalMethod(){
//        System.out.println("This method can't be changed!...");
//    }

}


abstract class WithoutAnyAbstractMethod{
    public void withoutAbstractMethods(){
        System.out.println("This is a abstract class without any abstract method!...");
    }
}

// Outter classs and Inner Class both can be abstract
abstract class AbstractClassWithInnerAbstractClass{
    abstract class childClassAsAbstract{

    }
}
/*

If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract
so that the next level Child class should provide implementation to the remaining abstract method.
*/
//Ex
//If MainClass is not implementing all the abstract methods of Abs AbstractClass the it we need to declare as
//abstract.
//abstract class MainClass extends AbstractClass{}
//abstract class nextImple extends AbstractClass{
//    @Override
//    public void nextMessage(String message){
//        System.out.println(message);
//    }
//}