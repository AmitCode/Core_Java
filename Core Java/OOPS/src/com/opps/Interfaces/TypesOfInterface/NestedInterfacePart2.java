package com.opps.Interfaces.TypesOfInterface;

class ClassNestedInterfaceMain{
    interface ClassNestedInterfaceSub{
        public void printMessage();
    }
}
class ClassNestedInterfaceMainImpl implements ClassNestedInterfaceMain.ClassNestedInterfaceSub{
    @Override
    public void printMessage(){
        System.out.println("ClassNestedInterfaceSub is a nested interface inside a Class");
    }
}
public class NestedInterfacePart2 {
    public static void main(String agrs[]){
        ClassNestedInterfaceMainImpl classNestedInterfaceMain = new ClassNestedInterfaceMainImpl();
        classNestedInterfaceMain.printMessage();
    }
}
