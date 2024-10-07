package oop.Encapsulation;

public class World {
    public static void main(String[] args) {
        People people = new People();
        people.setAge(24);
        people.setName("Sally");
        people.setSsn(1);

        System.out.println(people.getSsn());
    }
}
