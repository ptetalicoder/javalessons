package oop.Inheritance.abstractt;

public class PetPark {
    public static void main(String[] args) {
        Pet dog = new Dog("GSD", 4, "Akira");
        Pet cat = new Cat("Orange", 8, "Zuko");

        dog.speak();
        cat.speak();
    }
}
