package com.collections.list.ListImplementations.ArrayList;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //Iteration.
        //1.Using For Loop.
        System.out.println("Array List Operation using for loop:- ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }


    }
}
