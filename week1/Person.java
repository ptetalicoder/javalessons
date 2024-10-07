package week1;

public class Person {
    // this class is used as a blueprint "week1.Person" data in the application
    String name;
    int age;

    //    public static void main(String[] args) {
//        week1.Person myPerson = new week1.Person();// constructor method
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

    void countNumbers(int... numbers){
        for(int number : numbers){
            System.out.println(number);
            // varargs - one or more arguments are going to be provided to the method
            // must be the last parameter defined in method signature
        }
    }

    public static void main(String[] args) {
        Person personOne = new Person("Sally", 34);
        Person personTwo = new Person ("Billy", 35);


        personOne.greeting();
        personTwo.respondToGreeting();

        personOne.countNumbers(1,2,3,4,5,6,7);


    }

//        week1.Person person = new week1.Person();
//        person.name = "Sally";
//        person.age = 35;
//
//        week1.Person personTwo = new week1.Person();
//        personTwo.name = "Billy";
//        personTwo.age = 35;
//
//        System.out.println("Hello! My name is " + person.name + " and I am " + person.age + " years old");
//        System.out.println("Nice to meet you! " + person.name + ", my name is " + personTwo.name + " I am also " + personTwo.age);


    }

