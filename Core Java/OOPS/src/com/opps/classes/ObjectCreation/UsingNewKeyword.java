package com.opps.classes.ObjectCreation;

public class UsingNewKeyword {
    public static void main(String args[]){
        System.out.println("The Main Class!...");
        NewKeywordObectCreation obj = new NewKeywordObectCreation();
        obj.displayMessage();
    }
}

//Arrays are objects in java that's why we create an array using new keyword.
//The primitive types are now object in java that is why we do not use new keyword while creation of
//primitive types like int.
//The Object types of primitive types are Wrapper Class.

class NewKeywordObectCreation{
    int a;
    public  NewKeywordObectCreation(){
        a=10;
        System.out.println("Object is ceated!...");
    }
    public void displayMessage(){
        System.out.println("Object creation using new keyword!...");
    }
}

