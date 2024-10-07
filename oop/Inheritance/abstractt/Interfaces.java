package oop.Inheritance.abstractt;

public interface Interfaces {

    String INTERFACEFEILD = "Interface Field";

    void interfaceMethod();

    static void setInterfaceStaticMethod(){
        System.out.println("This method is called by referencing the interface directly");

    }

    default void defaultImplementation(){
        System.out.println("the inheriting class will use this implementation by default unless changed");
    }
}
