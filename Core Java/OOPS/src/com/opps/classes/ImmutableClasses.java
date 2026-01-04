package com.opps.classes;

import java.lang.reflect.Field;

public final class ImmutableClasses {
    //Steps to create immutable classes/object
    //1.Create a final class so it can't be changed.
    //2.Make all fields as private.
    //3.Do not create setter only create getters.
    //Assign values only with constructors.

    private final String name;
    public ImmutableClasses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class MainClas{
    public static void main(String[] args){
        try {
            ImmutableClasses immutableClasses = new ImmutableClasses("Amit");
            System.out.println(immutableClasses.getName());
            Field field = immutableClasses.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(immutableClasses,"Aman");
            System.out.println(immutableClasses.getName());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
