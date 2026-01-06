package com.collections.IterateOverCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingForLoop {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Collection iteration using for loop.");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        /*How it works:-
        1. Uses index.
        2.Access elements via index.
        */
        /*Advantages:-
        1.Full control over collection(Forward, Backward)
        2.Full control on index.
        3.Easy to modify the elements using index
        4.Best when index of elements/collection matters.*/

        /*Disadvantages:-
        * 1.Works only with collection based on index(No map,set,queue support).
        * 2.get(i) takes O(n) for linked list because of linked list traversal.
        * 3.No safe removal of elements.*/
        //Ex.
        System.out.println();
        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");
            list.remove(j);
        }

    }
}
