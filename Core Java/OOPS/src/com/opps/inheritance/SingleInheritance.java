package com.opps.inheritance;


//This is an example of single inheritance because here only SingleInheritanceChild have only single parent class.
public class SingleInheritance {
    int var1;
    int var2;

    public SingleInheritance(int a, int b){
        this.var1 = a;
        this.var2 = b;
    }

    public void displayAdd(){
        System.out.println("Var1(" +this.var1+") + Var2(" +this.var2 + ") = " + (this.var1 + this.var2));
    }
}

class SingleInheritanceChild extends SingleInheritance{

    public SingleInheritanceChild(int var1, int var2){
//        super(var1,var2);
        //super();//It is mandatory to have an empty constructor inside super clas if you are using this statement or you
        // not calling the constructor parametrized of super clas.
//        super.var1 = var1;
//        super.var2 = var2;
        super(var1,var2);
    }
    public static void main(String[] args){
        SingleInheritanceChild singleInheritanceChild =
                new SingleInheritanceChild(10,20);
        singleInheritanceChild.displayAdd();
    }
}
