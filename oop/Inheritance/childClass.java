package oop.Inheritance;

public class childClass extends ParentClass{

    String childStr;

    public childClass(String parString, String childStr) {
        super(parString);
        this.childStr = childStr;
    }

    public static void main(String[] args) {
        childClass obj = new childClass("this is parent string", "this is child");
        System.out.println(obj.parString);
        System.out.println(obj.childStr);

        ParentClass[] array = new ParentClass[1];
        array[0] = obj;

    }
}
