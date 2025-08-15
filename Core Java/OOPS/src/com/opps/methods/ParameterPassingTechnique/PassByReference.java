package com.opps.methods.ParameterPassingTechnique;
//In this the reference will be passed.
public class PassByReference {
    public static void main(String[] args){
        ObjectReference objectReference = new ObjectReference(20,30);
        System.out.println("value before Changing: " +objectReference.a + " and " +objectReference.b);
        objectReference.changeParam(objectReference);
        System.out.println("value after Changing: " +objectReference.a + " and " +objectReference.b);
    }

}
class ObjectReference{
    int a;
    int b;
    public ObjectReference(int var1, int var2){
        this.a = var1;
        this.b = var2;
    }

    public void changeParam(ObjectReference reference){
        reference.a += 10;
        reference.b += 20;
    }
}
