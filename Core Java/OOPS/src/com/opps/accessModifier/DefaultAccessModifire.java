package com.opps.accessModifier;

class DefaultAccessModifire {
    static String name;

    public DefaultAccessModifire(String name) {
        this.name = name;
    }

    public DefaultAccessModifire() {
    }
}


class MainClas{
    public static void main(String[] args) {
        DefaultAccessModifire accessModifire =
                new DefaultAccessModifire("Amit Kumar Pandey");
        System.out.println("Name: " + accessModifire.name);
    }
}

class DefaultAccessModifireSamePackage extends DefaultAccessModifire{
    public static void main(String[] args) {
        name = "Aman Kumar Pandey";
        System.out.println("Name: " +name);
    }
}
