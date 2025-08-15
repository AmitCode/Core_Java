package com.takingInput.BufferdReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferdReaderMainClass{
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! I am Amit!...");
        //Ways to take input
        //Way1.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Reads sequence of character.
        String str = reader.readLine();
        //Reads single of character.
        char chr = (char)reader.read();

        int data = Integer.parseInt(reader.readLine());
        System.out.println("You have entered " + str + " string");
        System.out.println("You have entered " + chr + " char");
        System.out.println("You have entered " + data + " Integer");

        //Way2.Scanner Class

        Scanner scanner = new Scanner(System.in);
    }
}
