package com.opps.classes.ObjectCloning;

import java.sql.SQLOutput;
class Test{
    int x;
}
//Deep Copy: If changes in one object is not reflecting another.
//Shallow Copy: If changes in one object is reflecting another.
class TestingClone implements  Cloneable{

    int v1;
    int v2;
    Test test = new Test();
//    public TestingClone(int a, int b){
//        System.out.println("Object is created!...");
//        this.v1 = a;
//        this.v2= b;
//    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void displayAdd(){
        System.out.println("Addition is: " +(v1+v2));
    }
}
public class UsingCloneMethod {
    public static void main(String[] args){
        System.out.println("Obect Cloning using Clone()!..");
        //    i) Usage of clone() method -Shallow Copy
        TestingClone test1 = new TestingClone();
        test1.v1 = 20;
        test1.v2= 30;
        test1.test.x=100;
        System.out.println("Before cloning!...");
        System.out.println("V2 : " +test1.v1 + ", V2 : " + test1.v2 + " and Test.x : " +test1.test.x);
        test1.displayAdd();
        try{
            System.out.println("After Cloning!...");
            TestingClone test2 = (TestingClone)test1.clone();
            //Above line will create a completely new object with different hashcode that means
            //the cloned object will be at different memory location.
            //but test is sharable in between test1 and test2 that why if we change x var of test
            //it will reflect in both.
            System.out.println("Test1.V2 : " +test1.v1 + ", Test1.V2 : " + test1.v2 + " and Test1.Test.x : " +test1.test.x);
            test2.v2=10;
            test2.test.x = 30;
            System.out.println("Test2.V2 : " +test2.v1 + ", Test2.V2 : " + test2.v2 + " and Test2.Test.x : " +test2.test.x);
            test2.displayAdd();
        }catch (CloneNotSupportedException exception){
            System.out.println("Exception : " +exception);

        }

    }
}


