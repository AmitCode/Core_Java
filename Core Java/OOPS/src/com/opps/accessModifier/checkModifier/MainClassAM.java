package com.opps.accessModifier.checkModifier;

/*
import com.opps.accessModifier.DefaultAccessModifier;
Error: Class is not public, Can't be accessed outside package.
*/

import com.opps.accessModifier.ProtectedAccessModifier;

public class MainClassAM {
    public static void main(String[] args) {
        /*DefaultAccessModifier accessModifier =
                new DefaultAccessModifier("Amit Kumar Pandey");
        Error: Class is not public, Can't be accessed outside package.*/
       /* System.out.println("Name: " + accessModifier.name);Error 'name' is not public in 'com. opps. accessModifire. DefaultAccessModifire'.
                Cannot be accessed from outside package*/
    }
}

class CheckProtectAmWrongWay{
    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier =
                new ProtectedAccessModifier("Amit Kumar Pandey!...");
        //protectedAccessModifier.display();'display()' has protected access in 'com. opps. accessModifier. ProtectedAccessModifier'
    }
}

class CheckProtectAmRightWay extends ProtectedAccessModifier{
    public CheckProtectAmRightWay(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier =
                new ProtectedAccessModifier("Amit Kumar Pandey!...");
//        protectedAccessModifier.display();
//        Error:display() has protected access in com.opps.accessModifier.ProtectedAccessModifier
    }
}
