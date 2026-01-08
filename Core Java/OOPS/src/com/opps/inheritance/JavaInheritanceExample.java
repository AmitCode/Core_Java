package com.opps.inheritance;

import java.util.Arrays;
import java.util.List;

public class JavaInheritanceExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.print();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        A a = new A();
        a.m();
//        s.o.p(a.i) —> 10 (Object of class A is created)
        B b = new B(30);
        b.m();
//        s.o.p(b.i) —> 20 (Object of class B is created)
        A a1 = new B(40);
        a1.m();
        System.out.println(a1.i);//Output will be 10, because the fields are resolved through the static
        // binding because they belong to the reference type not to the object.
        //(Object of A and B is created.);
        /*As the Class B is extending is class A that is why when we are doing A a1 = new B()
        * first the constructor of class A will be invoked then after the constructor of class be
        * will be invoked.*/
        /*Method of class be will be invoked because the java will look after the object of class not
        * to the reference because they are polymorphic(Polymorphism) if they are non-static and
        * non-private. and resolved through the dynamic binding.*/

        /*Note:-
        * Fields are resolved using compile-time (static) binding because they belong to the reference type,
        * whereas non-static, non-private instance methods are resolved using runtime (dynamic) binding.*/
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

class A{
    int i = 10;
    A(){
        System.out.println("Object of Class A is created...");
    }
    void m(){
        System.out.println("This is a method-M of A:" + i);
    }
}
class B extends A{
    int i = 20;
    B(int i) {
        /*First the constructor of class A be called:-
        *   -> If we are not calling super(arguments...); default constructor of A will be invoked.
        *   -> If we are not writing super() or super(arguments) then the default constructor of A will be invoked.
        *   -> If we are writing super(....) here then the matching constructor of A will be called.*/
       System.out.println("Object of Class B is created...");
    }
    void m() {
        System.out.println("This is a method-M of B:" + i);
    }
}
