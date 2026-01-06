package com.opps.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaInheritanceExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.print();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    }
}
class Parent{
    void print(){
        System.out.println("This is a Parent");
    }
}

class Child extends Parent{
    void print(){
        System.out.println("This is a Child");
    }
}
