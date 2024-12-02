import com.opps.classes.StaticClass;
import com.opps.methods.MethodClass;
import com.opps.methods.MethodsWithAccessModifiers;
import com.opps.methods.StaticMethods;

import java.lang.reflect.Method;

public class Main {
    public static <Static> void main(String[] args) {
        StaticClass object  = new StaticClass();
        Class mainClassObjct = object.getClass();
        Method[] methods = mainClassObjct.getDeclaredMethods();

        Class[] clsses = mainClassObjct.getClasses();
        Method[] staticClassMethods = null;
        for(Class iterate : clsses){
            staticClassMethods = iterate.getDeclaredMethods();
//          System.out.println("Nested Class: " + iterate);
        }
        assert staticClassMethods != null;
        for(Method method : staticClassMethods){
            System.out.println(method.getModifiers());
        }
        for(Method method : methods){
            System.out.println(method.getName());
        }
        System.out.println("Hello world!");
        //We can't create object of Static class object directly.
        //Not a way -> NestedClass staticClassObj = new NestedClass();
        //Way -> StaticClass.NestedClass staticClassObj = new StaticClass.NestedClass();

        MethodsWithAccessModifiers methodsWithAccessModifiers = new MethodsWithAccessModifiers();
        methodsWithAccessModifiers.publicMethods();
        //Not accessible
        //Error: 'privateMethods()' has private access in 'com.opps.methods.MethodsWithAccessModifiers'
        //methodsWithAccessModifiers.privateMethods();
        //Not accessible
        //Error: 'protectedMethods()' has protected access in 'com.opps.methods.MethodsWithAccessModifiers'
        //methodsWithAccessModifiers.protectedMethods();
        //Only accessible within the class and same package.
        //Error: 'defaultMethods()' is not public in 'com.opps.methods.MethodsWithAccessModifiers'. Cannot be accessed from outside packag
        //methodsWithAccessModifiers.defaultMethods();
        StaticMethods.display();
    }
}