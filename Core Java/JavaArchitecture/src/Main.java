import sun.reflect.generics.scope.ClassScope;
import sun.rmi.transport.ObjectTable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Class Loader Operation(Loading)
        //For every loaded “.class” file, only one object of the class is created.in Heap Memory.
        StudentClass studentClass = new StudentClass();
        StudentClass studentClass1 = new StudentClass();

        Class aClass = studentClass.getClass();
        Class bClass = studentClass1.getClass();

        //For every loaded “.class” file, only one object of the class is created.
        //irrespective of how much object we are creating of that class;
        //Ex: Here we have creted the two object for Student, and they are pointing to same
        //Class Object
        System.out.println("Is the above written is true: " +(aClass == bClass));
        //equal objects must have equal hash codes.
        System.out.println("Is HashCode are equal: "+(aClass.hashCode() == bClass.hashCode()));
        System.out.println("Class Name: "+aClass.getName());
        Method[] methods = studentClass.getClass().getDeclaredMethods();
        System.out.print("Methods of StudentClass: ");
        for(int i=0;i< methods.length;i++){
            System.out.println(i +": " + methods[i]);
            //Response will be like public void StudentClass.setId(int)
        }

        Field[] fields = studentClass.getClass().getDeclaredFields();
        System.out.print("Fields of StudentClass: ");
        for(int i=0;i< fields.length;i++){
            System.out.println(i +": " + fields[i]);
            //Response will be like java.lang.String StudentClass.studentName
        }

        //Class Loader Type.
//        Bootstrap class loader: AVA_HOME/jre/lib
//        Extension class loader:JAVA_HOME/jre/lib/ext
//        System/Application class loader:sun.misc.Launcher$AppClassLoader class.
        System.out.println("String Class Path: " + StudentClass.class.getClassLoader());
        System.out.println("Parent Class of StudentClass is: " +aClass.getSuperclass());
        Object object = new Object();
        Class oClass = object.getClass();
        System.out.println("aClass Hash Code: " +aClass.hashCode());
        System.out.println("bClass Hash Code: " +aClass.hashCode());


    }
}