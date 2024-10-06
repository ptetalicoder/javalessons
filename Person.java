public class Person {
    // this class is used as a blueprint "Person" data in the application
    String name;
    int age;

    public static void main(String[] args) {
//        Person myPerson = new Person();// constructor method
        //new indicates we are making an object
//        System.out.println(myPerson.name);
//        System.out.println(myPerson.age);
        // we can assign values to the fields of the object
//        myPerson.name = "Timmy";
//        myPerson.age = 205;
//        System.out.println(myPerson.name);
//        System.out.println(myPerson.age);
        Person person = new Person();
        person.name = "Sally";
        person.age = 35;

        Person personTwo = new Person();
        personTwo.name = "Billy";
        personTwo.age = 35;

        System.out.println("Hello! My name is " + person.name + " and I am " + person.age + " years old");
        System.out.println("Nice to meet you! " + person.name + ", my name is " + personTwo.name + " I am also " + personTwo.age);


    }
}
