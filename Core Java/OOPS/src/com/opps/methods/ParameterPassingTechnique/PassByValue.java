package com.opps.methods.ParameterPassingTechnique;
//The changes made in actual parameter in called function will reflect in caller function.
//Also known as CallByValue.
//In thing the called method gets the copy of parameter not the actual parameter that means the
//memory location will be different.
//Java in fact is strictly call by value.
public class PassByValue {

    public static void main(String[] args){
        int a = 30;
        int b = 40;

        System.out.println("Values of A and B before Calling callByValue!...");
        System.out.println("A: " +a +" and B: "+b);
        CallByValue callByValue = new CallByValue();
        callByValue.callByValue(a,b);
        System.out.println("Values of A and B after Calling callByValue!...");
        System.out.println("A: " +a +" and B: "+b);
    }
}

class CallByValue{
    public void callByValue(int a, int b){
        a = ++a;
        b = ++b;

        System.out.println("Values of a and b after changes in Caller function");
        System.out.println("A: "+ a + " and B: " +b);
    }
}
