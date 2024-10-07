package week1;

// maps are used for key-value pair, easier than list or sets

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap<>();

        phonebook.put("bill", 1234567890);
        phonebook.put("Sally", 21987654);
        phonebook.put("Slagathor",96969692);
        System.out.println(phonebook.get("Teddy"));
        System.out.println(phonebook.getOrDefault("Teddy", 405));


        System.out.println(phonebook.get("bill"));
        Set<String> keys = phonebook.keySet();
        for(String key : keys){
            System.out.println(key);

            // maps do not allow duplicate values
            // values can be duplicate

            for(int phoneNumber : phonebook.values()){
                System.out.println(phoneNumber);
            }


        }



    }
}
