/*
1. In the main() method, initialize a map named employeeMap consisting of pairs
<Integer, String>.
• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the
contents of the map on the screen.
• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and
display it. If the ID is not found in the map, notify the user using the containsKey()
function.
• Prompt the user to enter a name. Verify that the name exists in the employeeMap and
display the corresponding ID. If the name is not found in the map, notify the user using
the containsValue() function.
*/

package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        employeeMap.put(23, "Ben");
        employeeMap.put(54, "Gon");
        employeeMap.put(3, "Clara");

        System.out.println( employeeMap);

        ///
        System.out.println("Введіть ID для пошуку серед юзерів: ");
        int IDByUser = sc.nextInt();

        if (employeeMap.containsKey(IDByUser)) {
            System.out.println("Користувач з ззаданим ID: " + IDByUser + ", носить таке імя: " + employeeMap.get(IDByUser));
        } else {
            System.out.println("Такого ID немає в мапі.");
        }
        ///

        ///
        System.out.println("Введіть імя для пошуку серед юзерів: ");
        sc.nextLine();
        String nameByUser = sc.nextLine();

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) { // Тут просто форіч не працює, то найшов такий метод обходу
            if (entry.getValue().equals(nameByUser)) {
                System.out.println("Користувач з заданим ім’ям: " + nameByUser + ", носить таке ID: " + entry.getKey());
                break;
            }else {
                System.out.println("Такого імені немає в мапі.");
            }
        }
        ///
    }
}
