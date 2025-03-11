/*
2** If desired, you can make the previous task more challenging by selecting one or more of the
following options:
• Before adding ID-name pairs to the map, it is recommended to perform a check for
duplicate values. If duplicates are found, the user should be notified and the addition of data
to the map should be halted.
• In order to provide a more comprehensive record, the user should be prompted to input
additional information, such as position, salary, and date of birth, in addition to the ID and
name. This information should then be displayed on the screen when the map is output.
• To enable the editing of existing data, such as name, position, and salary, the user should be
prompted to input the ID of the record they wish to modify, as well as the updated data. The
updated map should then be displayed.
• For improved usability, the map should be sortable by various criteria, such as ID, name, and
position. The user should be prompted to enter the desired sorting criterion, and the sorted
map should then be displayed on the screen.
*/


package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.*;

public class PracticalTask2 {
    public static void main(String[] args) {
        Map<Integer, List<Object>> employeeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        employeeMap.put(23, new ArrayList<>(Arrays.asList("Ben", "Programmer", 239.5, "23/01/2000")));
        employeeMap.put(54, new ArrayList<>(Arrays.asList("Gon", "HR", 200.0, "02/11/2030")));
        employeeMap.put(3, new ArrayList<>(Arrays.asList("Clara", "Programmer", 2400.2, "22/05/2005")));

        System.out.println( employeeMap);

        ///
        System.out.println("Введіть ID для пошуку серед юзерів: ");
        int IDByUser = sc.nextInt();

        if (employeeMap.containsKey(IDByUser)) {
            System.out.println("Користувач з ззаданим ID: " + IDByUser + ", носить таке імя: " + employeeMap.get(IDByUser).getFirst());
        } else {
            System.out.println("Такого ID немає в мапі.");
        }
        ///

        ///
        System.out.println("Введіть імя для пошуку серед юзерів: ");
        sc.nextLine();
        boolean find = false;
        String nameByUser = sc.nextLine();

        for (Map.Entry<Integer, List<Object>> entry : employeeMap.entrySet()) { // Тут просто форіч не працює, то найшов такий метод обходу
            if (entry.getValue().get(0).equals(nameByUser)) {
                System.out.println("Користувач з заданим ім’ям: " + nameByUser + ", носить таке ID: " + entry.getKey());
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.println("Такого імені немає в мапі.");
        }
        ///

        ///
        sc.nextLine();
        System.out.println("Введіть імя нового користувача: ");
        String newName = sc.nextLine();
        sc.nextLine();

        System.out.println("Введіть ID нового користувача: ");
        int newID = sc.nextInt();
        sc.nextLine();

        System.out.println("Введіть позицію нового користувача: ");
        String newPosition = sc.nextLine();
        sc.nextLine();

        System.out.println("Введіть зарплату нового користувача: ");
        double newSalary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Введіть дату народження нового користувача: ");
        String newBDayDate = sc.nextLine();

        boolean findSameName = false;

        for (Map.Entry<Integer, List<Object>> entry : employeeMap.entrySet()) {
            if (entry.getValue().get(0).equals(newName)){
                findSameName = true;
            }
        }
        if (!findSameName){
            System.out.println("Імя " + newName + " ще не зайняте!");
            employeeMap.put(newID, new ArrayList<>(Arrays.asList(newName, newPosition, newSalary, newBDayDate)));
        }
        ///

        ///
        System.out.println("Вивід усіх працівників: ");
        for (Map.Entry<Integer, List<Object>> entry : employeeMap.entrySet()) {
            System.out.println("\n\nID працівника: " + entry.getKey());
            System.out.println("Імя працівника: " + entry.getValue().getFirst());
            System.out.println("Позиція працівника: " + entry.getValue().get(1));
            System.out.println("Зарплата працівника: " + entry.getValue().get(2));
            System.out.println("Дата народження працівника: " + entry.getValue().get(3));
        }
        ///
        sc.close();
    }
}
