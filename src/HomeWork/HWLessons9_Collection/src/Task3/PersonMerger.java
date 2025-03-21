package Task3;
import java.util.*;

class PersonMerger {

    // TODO: Implement method to merge and sort persons by age
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();
        List<Person> list3 = new LinkedList<Person>();
        list3.addAll(0, list1);
        list3.addAll(0, list2);
        Collections.sort(list3, new Person.ByAge());
        Set<Person> set = new LinkedHashSet<>(list3);
        list3 = new ArrayList<>(set);
        return list3;
    }

    // TODO: Implement method to filter persons by a minimum age
    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        List<Person> result = new ArrayList<>();
        if (persons == null) {
            return result;
        }
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                result.add(person);
            }
        }
        return result;
    }


    // TODO: Implement method to calculate the average age of persons
    public static double calculateAverageAge(List<Person> persons) {
        if (persons == null) {
            return 0.0;
        }
        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }
        return (double) sum / persons.size();
    }


}