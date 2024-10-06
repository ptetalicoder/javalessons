public class Person {
    // this class is used as a blueprint "Person" data in the application
    String name;
    int age;

    //    public static void main(String[] args) {
//        Person myPerson = new Person();// constructor method
    //new indicates we are making an object
//        System.out.println(myPerson.name);
//        System.out.println(myPerson.age);
    // we can assign values to the fields of the object
//        myPerson.name = "Timmy";
//        myPerson.age = 205;
//        System.out.println(myPerson.name);
//        System.out.println(myPerson.age);
    public Person(String name, int age) {


        this.name = name;
        this.age = age;
    }
    void greeting(){
        System.out.println("Hello! My name is " + this.name + " and I am " + this.age + " years old");
    }
    void respondToGreeting(){
        System.out.println("Nice to meet you!, my name is " + this.name + " I am " + this.age);
    }

    public static void main(String[] args) {
        Person personOne = new Person("Sally", 34);
        Person personTwo = new Person ("Billy", 35);


        personOne.greeting();
        personTwo.respondToGreeting();


    }

//        Person person = new Person();
//        person.name = "Sally";
//        person.age = 35;
//
//        Person personTwo = new Person();
//        personTwo.name = "Billy";
//        personTwo.age = 35;
//
//        System.out.println("Hello! My name is " + person.name + " and I am " + person.age + " years old");
//        System.out.println("Nice to meet you! " + person.name + ", my name is " + personTwo.name + " I am also " + personTwo.age);


    }

