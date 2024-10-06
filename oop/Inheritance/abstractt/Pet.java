package oop.Inheritance.abstractt;



public abstract class Pet {
    public String species;
    public int age;
    public String name;

    public Pet(String species, int age, String name){
        this.species = species;
        this.age = age;
        this.name = name;

    }

    public void ageUp(){
        age++;
        System.out.println(name + "is now " + age);
    }

    public abstract void speak();


}
