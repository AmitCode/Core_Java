package com.opps.methods.MethodOverloading;
//1.Changing the Number of Parameters.
//2.Changing Data Types of the Arguments.
//3.Changing the Order of the Parameters of Methods
public class WaysToMethodOverloading {
    public static void main(String[] args){
        System.out.println("Method Overloading!...");
        ChangingTheNumberOfParameters changingTheNumberOfParameters  = new ChangingTheNumberOfParameters();
        System.out.println("Way1 -----> ChangingTheNumberOfParameters ");
        changingTheNumberOfParameters.add(1,2);
        changingTheNumberOfParameters.add(1,2,3);

        System.out.println("Way2 -----> ChangingDataTypesOfTheArguments ");
        ChangingDataTypesOfTheArguments changingDataTypesOfTheArguments = new ChangingDataTypesOfTheArguments();
        changingDataTypesOfTheArguments.displayAdd("message",1);
        changingDataTypesOfTheArguments.displayAdd("message",1.12);
        changingDataTypesOfTheArguments.displayAdd(1,1.23);

        System.out.println("Way3 -----> ChangingTheOrderOfTheParametersOfMethods ");
        ChangingTheOrderOfTheParametersOfMethods object = new ChangingTheOrderOfTheParametersOfMethods();
        object.displayMessage("message", 1);
        object.displayMessage(1, "message");
    }
}
class ChangingTheNumberOfParameters{
    public void add(int num1, int num2){
        System.out.println("add() method with 2 argument");
        System.out.println("num1 + num2   " +(num1 + num2));
    }

    public void add(int num1, int num2, int num3){
        System.out.println("add() method with 3 argument");
        System.out.println("num1 + num2 + num2 = " +(num1 + num2 + num3));
    }
}

class ChangingDataTypesOfTheArguments{
    public void displayAdd(String message, int num2){
        System.out.println("displayAdd() method with String, int");
        //System.out.println("num1 + num2 + num2 = " +(num1 + num2));
    }

    public void displayAdd(String message, double num2){
        System.out.println("displayAdd() method with String, double");
        //System.out.println("num1 + num2 + num2 = " +(num1 + num2));
    }

    public void displayAdd(int message, double num2){
        System.out.println("displayAdd() method with int, double");
        //System.out.println("num1 + num2 + num2 = " +(num1 + num2));
    }
}

class ChangingTheOrderOfTheParametersOfMethods{
    public void displayMessage(String str1, int num){
        System.out.println("displayMessage(String str1, int num)");
    }
    //Not in this way...
    //public void displayMessage(int num, int str1)
    //public void displayMessage(int str1, int num)
    public void displayMessage(int num, String str1){
        System.out.println("displayMessage(int num, String str1)");
    }
}


//Note: Both C++ and Java, methods cannot be overloaded according to the return type.
//Does Java support Operator Overloading?
//Unlike C++, Java doesn’t allow user-defined overloaded operators. Internally Java overloads operators, for example, + is overloaded for concatenation.
//Can we overload methods on return type?= No