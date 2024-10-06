import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {
        /* A fort loop statement has three parts:
        control variable initialization
        control statement
        control variable increment
         */

        for(int x = 0; x <= 10; x++){
            System.out.println(x);

        }

        String[] names = {"Billy", "Sally", "Timmy", "Gus"};
//        for(int index = 0; index < names.length; index++){
//            System.out.println("Hello " + names[index]);
//        }
        // below is the enhanced loop, simpler

        for(String name : names){
            System.out.println("Hello " + name);
        }

        Scanner userInput = new Scanner(System.in);

        boolean repeatProcess = true;
        while(repeatProcess){
            System.out.println("What would you like to do?");
            System.out.println("1. repeat code");
            System.out.println("2. end loop");
            String userChoice = userInput.nextLine();
            switch (userChoice){
                case "2":
                    System.out.println("Goodbye");
                    repeatProcess = false;
                    break;
                default:
                    System.out.println("Loop is continuing");
            }

        }
        userInput.close();
        /* In a do while loop[ the code excecuition happens first,
        and then the conditional check is made, so you will get at least one iteration of your loop
         */
        do{
            System.out.println("This will trigger at least one time");
        } while(false);
    }
}

