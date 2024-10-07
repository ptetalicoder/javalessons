package week1;
import java.util.HashSet;
import java.util.Set;

// sets are useful when you want to filter data

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Billy");
        names.add("Sally");
        names.add("Brutus");
        names.add("Slagathor");

        System.out.println(names);
    }
}
