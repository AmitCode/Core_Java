package com.collections.map.mapImplementation.HashMapMapImpl;

import com.collections.StudentClass;

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
        HashMap<Integer, Integer> inMap = new HashMap<>();
        inMap.put(1, 1);
        inMap.put(2, 2);
        inMap.put(3, 3);
//        HashMap<Integer, int> Type argument cannot be of a primitive type.
        //Iteration over hashmap->
        //Using for-each loop
        //Methods of Map.
        /*Put--->*/
        map.put(4, "four");
        System.out.println(map);
        map.put(4, "Zero Four");
        System.out.println(map);
        /*If Key is found the data will be replaced else the new key will be inserted.*/
        //Get
        System.out.println("Key:- 1" + ", Value: " + map.get(1));//one
        System.out.println("Key:- 2" + ", Value: " + map.get(5));//null
        System.out.println("Key:- 1" + ", Value: " + inMap.get(1));//one
        System.out.println("Key:- 2" + ", Value: " + inMap.get(5));//null
        /*If key is found the data will be returned else null be returned because the default value of
        object is null.*/
        //Remove
        System.out.println(map.remove(1) + " is removed.");//one is removed.
        System.out.println(map.remove(5) + " is removed.");//null is removed.
        /*If the key is found the data will be removed else and value of key will be returned.
        * else null be returned.*/
        System.out.println("Map Student----> ");
        Map<StudentClass, String> studentClassStringMap = new HashMap();
        StudentClass s1 = new StudentClass("abc");
        StudentClass s2 = new StudentClass("mpq");
        StudentClass s3 = new StudentClass("abc");
        studentClassStringMap.put(s1, "jkl");
        studentClassStringMap.put(s2, "xyz");

        studentClassStringMap.get(s1); //—> jkl
        studentClassStringMap.get(s2); //—> xyr
        studentClassStringMap.get(s3); //—> null
        //correct.

        System.out.println(studentClassStringMap.get(s1));
        System.out.println(studentClassStringMap.get(s2));
        System.out.println(studentClassStringMap.get(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
