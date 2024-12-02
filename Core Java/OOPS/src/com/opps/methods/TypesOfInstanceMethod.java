package com.opps.methods;
//There are two types of methods in java.
//1.Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method. We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.
//2.Mutator Method:The method(s) read the instance variable(s) and also modify the values. We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.
public class TypesOfInstanceMethod {
    private String myName;

    //Mutator Method
    public void setMyName(String name){
        this.myName = name;
    }

    //Accessor Method
    public String getMyName(){
        return "My name is: "+this.myName;
    }

    public static void main(String[] args){
        TypesOfInstanceMethod typesOfInstanceMethod = new TypesOfInstanceMethod();
        typesOfInstanceMethod.setMyName("Amit Kumar Pandey");
        System.out.println(typesOfInstanceMethod.getMyName());
    }
}