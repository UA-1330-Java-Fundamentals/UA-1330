package Task2;

import java.util.HashMap;
import java.util.Map;

public class PersonFullName {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Emma", "Johnson");
        personMap.put("Liam", "Williams");
        personMap.put("Olivia", "Brown");
        personMap.put("Noah", "Jones");
        personMap.put("Ava", "Garcia");
        personMap.put("Elijah", "Miller");
        personMap.put("Sophia", "Davis");
        personMap.put("James", "Martinez");
        personMap.put("Isabella", "Hernandez");
        personMap.put("Benjamin", "Lopez");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("First name: " + entry.getKey() + " Last name: " + entry.getValue());
        }
        System.out.println("");
        personMap.remove("Benjamin");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("First name: " + entry.getKey() + " Last name: " + entry.getValue());
        }
    }
}
