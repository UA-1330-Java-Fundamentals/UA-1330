/*
Create a map called personMap and populate it with ten entries of type <String,
String>, where each entry corresponds to a person's last name and first name. Display
the contents of the map on the screen. Are there at least two persons with the same
first name among these ten people? Remove the person from the map whose first
name is "Orest" (or any other specified name). Print the resulting map after the
removal.
*/

package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.*;

public class HomeWork2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "Michael");
        personMap.put("Brown", "Sarah");
        personMap.put("Jones", "David");
        personMap.put("Garcia", "Sophia");
        personMap.put("Lebron", "Daniel");
        personMap.put("Davis", "Daniel");
        personMap.put("Martinez", "James");
        personMap.put("Hernandez", "Emma");

        System.out.println(personMap);
        Set<String> uniqueNames = new HashSet<>();
        boolean hasDuplicates = false;

        for (String name : personMap.values()) {
            if (!uniqueNames.add(name)) {
                hasDuplicates = true;
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("У мапі є як мінімум два однакових імені");
        } else {
            System.out.println("У мапі немає дублікатів імен.");
        }

//        for (Map.Entry<String, String> entr :  personMap.entrySet()){
//            if (entr.getValue().equels("James")){
//                System.out.println("Видаляємо James, так як його знайдено у масиві");
//                personMap.remove(entr.getKey());
//                break;
//            }
//        }

        Iterator<String> iterator = personMap.values().iterator();
        while (iterator.hasNext()){
            String cur = iterator.next();
            if (cur.contains("James")){
                iterator.remove();
            }
        }

        System.out.println(personMap);
    }
}
