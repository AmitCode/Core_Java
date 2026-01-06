package com.collections.IterateOverCollection;

import java.util.*;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Collection(List) iteration using iterator:- ");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
            itr.remove();//Allows safe removal.
            //list.remove(list.size()-1)-> will throw java.util.ConcurrentModificationException
            //list.add(6)-> java.util.ConcurrentModificationException
        }

        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.print("Collection(Set) iteration using iterator:- ");
        itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
            itr.remove();//No error.
            //set.remove(itr.next()); -> will throw ConcurrentModificationException
            //set.add(5);//No Exception.
            //set.add(6); -> will throw ConcurrentModificationException
        }
        System.out.println();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        System.out.print("Collection(Map) iteration using iterator:- ");
        itr = map.entrySet().iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
            //itr.remove();//No exception.
            //map.remove(3);//Exception.
            map.put(5,51);//No error.
            //map.put(6,10);//Exception.
        }

        /*How it works
         * 1.Uses cursor based traversal.
         * One direction(Forward only).*/
        /*Advantages:-
         * 1.Clean and readable.
         * 2.Supports all types of collection.
         * 3Allows safe removal.
         * 4.No ConcurrentModificationException*/
        /*Disadvantages
         * 1.No backword traversal.*/
    }
}
