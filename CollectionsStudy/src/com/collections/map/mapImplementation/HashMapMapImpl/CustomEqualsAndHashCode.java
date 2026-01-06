package com.collections.map.mapImplementation.HashMapMapImpl;

import com.collections.StudentClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomEqualsAndHashCode {

    public static void main(String[] args) {
        HashMap<StudentClass, String> hashMap = new HashMap<>();
        StudentClass s1 = new StudentClass(1,"Amit Kumar Pandey","SNO1");
        StudentClass s2 = new StudentClass(2,"Aman Kumar Pandey","SNO2");
        StudentClass s3 = new StudentClass(1,"Akash Kumar Pandey","SNO3");

        hashMap.put(s1,"Amit Kumar Pandey");
        hashMap.put(s2,"Amit Kumar Pandey");
        hashMap.put(s3,"Amit Kumar Pandey");
        System.out.println(hashMap.size());
        Iterator<HashMap.Entry<StudentClass, String>> iterator = hashMap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<StudentClass, String> entry = iterator.next();
            System.out.println(entry.getValue() + " " +entry.getKey());
        }

        System.out.println(s1.equals(s3));
    }
}
