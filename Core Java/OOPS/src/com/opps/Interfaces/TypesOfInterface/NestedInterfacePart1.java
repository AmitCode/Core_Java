package com.opps.Interfaces.TypesOfInterface;
/*
interfaces as members of a class or another interface.
Such an interface is called a member interface or nested interface
*/
interface MainInterface{
    public void printMessageMain();
    interface SubInterface{
        public void printMessageSub();
    }
}

class ImplNestedInterface implements MainInterface.SubInterface{
    @Override
    public void printMessageSub(){
        System.out.println("SubInterface is Nested Interface!...");
    }
}

public class NestedInterfacePart1 {
    public static void main(String[] args){
        ImplNestedInterface implNestedInterface = new ImplNestedInterface();
        implNestedInterface.printMessageSub();
    }
}
