package com.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
* Map interface in collection hierarchy that helps us to store the data in key and value paris.*/
public class MapIntroduction {
    public static void main(String args[]){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        System.out.println(map);
    }
}
