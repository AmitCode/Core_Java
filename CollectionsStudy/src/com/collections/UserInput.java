package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static ArrayList<Integer> userInput(ArrayList<Integer> input, int length) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(length > 0)
        {
            arrayList.add(scanner.nextInt());
            length--;
        }
        return  arrayList;
    }
}
