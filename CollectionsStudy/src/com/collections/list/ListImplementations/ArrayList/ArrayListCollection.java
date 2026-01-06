package com.collections.list.ListImplementations.ArrayList;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();//Create an ArrayList with default capacity
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("Numbers : " + nums);
        nums.ensureCapacity(39);//Specify the capacity of ArrayList after creating it.
        ArrayList<Integer> nums2 = new ArrayList<>(5);//Create an Array List of custom capacity
        nums2.add(10);
        nums2.add(20);

        System.out.println("Numbers : " + nums2);

        ArrayList<Integer> nums3 = new ArrayList<>(nums);//Creating an Array List with other collection.
        System.out.println("Numbers : " + nums3);

        System.out.println("Number Size : " + nums3.size());

        //Array Method
        //Adding
        nums3.add(60);//Adds at the end.
        nums3.add(6,70);//Adds at particular index.
        //If the index is greater than list.size() then it will throw IndexOutOfBoundsException.
        System.out.println("Numbers 3 New : " + nums3);

        //Removing
        nums3.remove(6);//Removes the element at particular index.
        System.out.println("Numbers 3 New : " + nums3);
        nums3.remove(Integer.valueOf(40));//Removes at particular element.
        System.out.println("Numbers 3 New : " + nums3);

        //Checking
        System.out.println("Is 20 present : " + nums3.contains(70));

        //Get
        System.out.println("Element at index 1 : " + nums3.get(2));
    }
}
