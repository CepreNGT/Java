package hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneRB {
    Map<String, HashSet<String>> phoneNumbers = new HashMap<>();

    public void add(String surname, String phoneNumber){
        HashSet<String> set = phoneNumbers.getOrDefault(surname, new HashSet<>());
        set.add(phoneNumber);
        phoneNumbers.put(surname, set);
    }

    public HashSet<String> get(String surname){
        return phoneNumbers.getOrDefault(surname, new HashSet<>());
    }
}
