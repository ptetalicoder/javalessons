public class Person {
    // this class is used as a blueprint "Person" data in the application
    String name;
    int age;

    public static void main(String[] args) {
        Person myPerson = new Person();// constructor method
        //new indicates we are making an object
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);
        // we can assign values to the fields of the object
        myPerson.name = "Timmy";
        myPerson.age = 205;
        System.out.println(myPerson.name);
        System.out.println(myPerson.age);

    }
}
