package homework10;

import java.util.HashMap;
import java.util.Map;

/*
Create a map called personMap and populate it with ten entries of type <String,
String>, where each entry corresponds to a person's last name and first name. Display
the contents of the map on the screen. Are there at least two persons with the same
first name among these ten people? Remove the person from the map whose first
name is "Orest" (or any other specified name). Print the resulting map after the
removal.
 */
public class Task2Person {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Crossan", "Sarah");
        personMap.put("Pearce", "Philippa");
        personMap.put("Rogashko", "Alla");
        personMap.put("Cherninka", "Olena");
        personMap.put("Hogan", "Root");
        personMap.put("Headley", "Maria");
        personMap.put("Belimova", "Tetiana");
        personMap.put("Dolik", "Maria");
        personMap.put("Zawarda", "Olena");
        personMap.put("Pear", "Nataly");

        //Displaying map on the screen
        System.out.println("Original map:");
        for(Map.Entry<String,String> m : personMap.entrySet()){
            System.out.println(m.getValue() + " " + m.getKey());
        }

        //Searching for duplicate names
        Map<String, Integer> nameCount = new HashMap<>();
        for(String name: personMap.values()){
              nameCount.put(name, nameCount.getOrDefault(name,0) + 1);
        }

        System.out.println("-----------------");
        System.out.println("Duplicate names: ");
        for(Map.Entry<String,Integer> m : nameCount.entrySet()) {
            if (m.getValue() > 1) {
                System.out.println(m.getKey() + " appears " + m.getValue() + " times.");
            }
        }



        //Remove the person from the map whose first name is "Tetiana"
       String nameToRemove = "Tetiana";
       String keyToRemove = null;

        for(Map.Entry<String,String> m : personMap.entrySet()){
            if(m.getValue().equals(nameToRemove)){
                keyToRemove = m.getKey();
                break;
            }
        }
        System.out.println("-----------------");
        if(keyToRemove != null){
            personMap.remove(keyToRemove);
            System.out.println("Map after removing name: ");
            for(Map.Entry<String,String> m : personMap.entrySet()){
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }else{
            System.out.println("Name is not found in the map");
        }

    }
}
