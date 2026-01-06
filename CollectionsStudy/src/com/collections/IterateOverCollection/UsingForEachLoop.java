package com.collections.IterateOverCollection;

import java.util.*;

public class UsingForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Collection(List) iteration using for-each loop:- ");
        for(Integer num : list){
            System.out.print(num + " ");
            /*list.add(num + 1); Exception in thread "main" java.util.ConcurrentModificationException
            list.remove(list.size()-1); Exception in thread "main" java.util.ConcurrentModificationException*/
        }

        System.out.println();
        HashSet<Integer> set = new HashSet<>(list);
        System.out.print("Collection(Set) iteration using for-each loop:- ");
        for (Integer num : set){
            System.out.print(num + " ");
            /* set.add(5);
            If you are adding a data that is present it the set it will not through any error, as 5 is present.
            * set.add(6);
            If If you are adding a data that is present it the set it will not through any error,
            as 6 is not present it will throw java.util.ConcurrentModificationException*/

            /*set.remove(7);
            * If key is not present works normally.
            * set.remove(5);
            * If Key is present it will throw java.util.ConcurrentModificationException*/
        }

        System.out.println();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        System.out.println("Collection(Map) iteration using for-each loop:- ");
        for (Map.Entry<Integer,Integer> num : map.entrySet()){
            System.out.println("Key: " + num.getKey() + " Value: " + num.getValue() + " ");
            /* map.put(5,50);
              map.put(5,60);
            If you are adding a data that is present it the set it will not through any error,
            as 5 is present data will be updated.
            * map.put(6,50);
            If If you are adding a data that is present it the set it will not through any error,
            as 6 is not present it will throw java.util.ConcurrentModificationException*/

            /*map.remove(7);
             * If key is not present works normally.
             * map.remove(5);
             * If Key is present it will throw java.util.ConcurrentModificationException*/
        }

        /*How it works
        * 1.Internally uses iterator.*/
        /*Advantages:-
        * 1.Clean and readable.
        * 2.Supports all types of collection.
        * List boilerplate code.*/
        /*Disadvantages
        * 1.Can't remove elements.*/
    }
}
