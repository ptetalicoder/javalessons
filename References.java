public class References {
    // References are variables that point to an object in memeory

    public static void main(String[] args) {
        // if the reference exists the object will not be removed from memory
        String name = "Sally";
        if(true){
            // the nameTwo reference only exists in this inner block of code
            String nameTwo = "Billy";
            // we can refer to the outer variable which is sally
            System.out.println(name);
            System.out.println((nameTwo));
        }
        System.out.println(name);
//        System.out.println(nameTwo);
        // sally only works because it is outside while billy/ nameTwo is inside the if statement
    }
}
