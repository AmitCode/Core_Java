package com.opps.Constructors;

import java.sql.SQLOutput;

/*
Init Block: Init block is always executed before any constructor, whenever a constructor is used for creating a new object.
When we want certain common resources to be executed with every constructor we can put the code in the init block.
*/

//NOTE: If there are more than one blocks, they are executed in the order in which they are defined within the same class
public class InitBlockExecutingBeforeConstructor {
    {
        System.out.println("Executing before constructor!....");
    }
    public InitBlockExecutingBeforeConstructor(){
        System.out.println("Executing default constructor!...");
    }


    public static void main(String[] args){
        System.out.println("Init Block!...");
        InitBlockExecutingBeforeConstructor initBlock = new InitBlockExecutingBeforeConstructor();
    }
}
