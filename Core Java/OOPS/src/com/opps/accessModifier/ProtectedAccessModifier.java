package com.opps.accessModifier;

//Protected: Protected access modifier allows classes, methods, and variables to be accessed within the same package or in a subclass outside of the package.
//it cannot be applied to the main class
public class ProtectedAccessModifier {
    protected String name;

    public ProtectedAccessModifier(String name) {
        this.name = name;
    }

    protected void display(){
        System.out.println("Name: " + this.name);
    }
}

class MainProtectedAM{
    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier =
                new ProtectedAccessModifier("Amit Kumar Pandey!...");
        System.out.println("Name: " +protectedAccessModifier.name);//Accessing protected variable in the same package
        protectedAccessModifier.display();//Accessing protected method in the same package
    }
}
