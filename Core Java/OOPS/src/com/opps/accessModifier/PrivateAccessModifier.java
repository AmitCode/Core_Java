package com.opps.accessModifier;

public class PrivateAccessModifier {
    //Private Access Modifier has most restricted access.
    //If a variable, method or a class is private, it will only be accessible within
    // the same class.
    //The Top most class can't be private.
    //Only inner class can be private.
    /*The main class is the one that contains the main method (public static void main(String[] args)).
    A private class cannot be a main class because it wouldn't be accessible.
    Private inner classes exist inside an outer class and are only accessible within that outer class.*/
    //Private variable of a class can only be accessible with getter and setter methods.
    private int a,b;

    public PrivateAccessModifier(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void display(){
        System.out.println("A: " + a + ", B: " + b);
    }

    public void wrapperMethod(){
        System.out.println("Wrapper Method has be called to access the private method of class.");
       display();
    }


    public static void main(String[] args){
        PrivateAccessModifier accessModifier = new PrivateAccessModifier(20,30);
        accessModifier.display();
    }

    private class InnerPrivateClass{
//        a = 10; Error Incorrect! This should be inside a method or constructor.
        public void viewDetails(){
//            a = 10;
//            PrivateAccessModifier.this.a = 10;  Correct way to access outer class private variable
            System.out.println("A: " + a + ", B: " + b);
        }
    }
}

class PAccessModifier{
    public static void main(String[] args) {
        PrivateAccessModifier accessModifier = new PrivateAccessModifier(30,50);
        System.out.println("A: " + accessModifier.getA() + ", B: " +accessModifier.getB());
        //Ways to access private members of class.
        //Variable: getter/setter methods. Example: - Above
        //Methods: Wrapper Methods
        //accessModifier.display(); Error: 'display()' has private access in 'com. opps. accessModifier. PrivateAccessModifier'
        accessModifier.wrapperMethod();
    }
}

