package com.opps.methods;
//Dynamic Binding or Late Binding is a which is done it time of run time.
//When type of the object is determined at run-time, it is known as dynamic binding.
//In Dynamic binding compiler does not decide the method to be called.
//overridden methods use dynamic binding, i.e, at run time.
//Dynamic binding uses Objects to resolve to bind.
public class DynamicOrLateBinding {
    static class SuperClass{
        public void displayMessage(){
            System.out.println("This is SuperClass!...");
        }
    }

    static class SubClass extends SuperClass{
        @Override
        public void displayMessage(){
            System.out.println("This is SubClass!...");
        }
    }

    public static void main(String[] args){
        System.out.println("This is Dynamic Binding!...");
        SuperClass superClass = new SuperClass();
        SuperClass subClass = new SubClass();
        superClass.displayMessage();
        subClass.displayMessage();
    }
}
