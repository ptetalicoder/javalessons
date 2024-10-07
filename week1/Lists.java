package week1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        // can store anytype you need to use <>
        List<String> names = new LinkedList<>();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        names.add("Billy");
        names.add("Sally");
        names.add("Brutus");
        names.add("Slagathor");

        System.out.println(names);

        // linked and array looks the same
    }
}
