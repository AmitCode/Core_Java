package com.opps.inheritance;

//This is an example of multilevel inheritance because here MultilevelInheritance is the parent
// class and MultilevelInheritanceChild is also the parent class MultilevelInheritanceNextChild.
public class MultilevelInheritance {
    int var1;
    int var2;

    public MultilevelInheritance(int a, int b){
        System.out.println("Calling parent class constructor!...");
        this.var1 = a;
        this.var2 = b;
    }

    public void displayAdd(){
        System.out.println("Var1(" +this.var1+") + Var2(" +this.var2 + ") = " + (this.var1 + this.var2));
    }
}

class MultilevelInheritanceChild extends MultilevelInheritance{
    String name;
    public MultilevelInheritanceChild(int var1, int var2, String name){
//        super(var1,var2);
        //super();//It is mandatory to have an empty constructor inside super clas if you are using this statement or you
        // not calling the constructor parametrized of super clas.
//        super.var1 = var1;
//        super.var2 = var2;
        super(var1,var2);
        this.name = name;
        System.out.println("Calling parent class constructor!...");
    }

    public void displayName(){
        System.out.println("Name: " +this.name);
    }
}

class MultilevelInheritanceNextChild extends MultilevelInheritanceChild{
    public MultilevelInheritanceNextChild(int var1, int var2,String name){
        super(var1,var2,name);
    }

    public static void main(String[] args){
        MultilevelInheritanceNextChild multilevelInheritanceNextChild =
                new MultilevelInheritanceNextChild(10,20, "Amit Kumar Pandey");
        multilevelInheritanceNextChild.displayName();
        multilevelInheritanceNextChild.displayAdd();
    }
}
