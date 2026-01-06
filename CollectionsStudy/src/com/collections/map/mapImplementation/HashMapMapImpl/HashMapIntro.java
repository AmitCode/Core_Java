package com.collections.map.mapImplementation.HashMapMapImpl;

import java.util.HashMap;
import java.util.Map;

/*HashMap is an implementation of map interface which help to store data in key and value pairs.*/
public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
        //Iteration over hashmap->
        //Using for-each loop
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key:- " +entry.getKey()+ " Value:- " + entry.getValue());
        }

    }
}
