public class StoringData {
    // Anytiome you need to store a collection of data Arrays are bult in Class that can be used

    public static void main(String[] args) {
        // To make an Array Object you add [] to the class type
        String[] names = new String[]{"Billy", "Sally", "Timmy", "Gus"};
        //alternative
        String namesAlternate[] = {"Billy", "Sally", "Timmy", "Gus"};
        // another alternative
        String[] namesAlternateTwo = {"Billy", "Sally", "Timmy", "Gus"};

        // to access the data in the arrays you use index position of data, it starts aty 0
//        System.out.println(names[0]);
        names[0] = "Shawn";
        // shawn replaces billy
        System.out.println(names[3]);
        //the most recent print statement prints the change

        String[] emptyList = new String[5];

        System.out.println(emptyList[4]);

        emptyList[4] = "Jules";

        System.out.println(emptyList[4]);

        System.out.println(emptyList.length);
    }
}
