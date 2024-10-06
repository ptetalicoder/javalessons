public class ConditionalStatements {
    public static void main(String[] args) {
        boolean isMorning = false;
        if(isMorning) {
            System.out.println("Hello World!");
        } else {
            System.out.println("See you later world!");
        }

        int x = 4;
        if (x % 2 == 0){
            // == is equality operator, it checks if values are the same, if objects have the same memory address
            // % is divide
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

            // dont have to have else in if/else

        String name ="Lassy";
        if(name.length() > 4){
            System.out.println("Your name has a lot of letters");
        }
        System .out.println("Your name is " + name);

        int y = 10;
        if(y < 0){
            System.out.println("y is positive");
        } else if (y > 0){
            System.out.println("y is negative");
        } else {
            System.out.println("y is 0");
        }



        System.out.println("Hello please choose an option");
        System.out.println("1. Login");
        System.out.println("2. Register an Account");
        System.out.println("3. Contact Support");
        System.out.println("4. Exit");
        int choice = 2;
        System.out.println("User choice : " + 2);

        // can use a switch statement if you multiple options to impliment

        switch (choice){
            case 1:
                System.out.println("Login chosen");
                break;
            case 2:
                System.out.println("Registration chosen");
                break;
            case 3:
                System.out.println("Customer Support chosen");
                break;
            case 4:
                System.out.println("Goodbye!");
            default:
                System.out.println("Invalid choice, please try again");
                break;

        }

    }
}
