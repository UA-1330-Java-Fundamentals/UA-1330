package homework9.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonMerger {

    // TODO: Implement method to merge and sort persons by age
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        if (list1 == null){
            list1 = new ArrayList<>();
        }
        if (list2 == null){
            list2 = new ArrayList<>();
        }

        List<Person> mergedList = new ArrayList<>();

        for ( Person i : list1){
            if(! mergedList.contains(i)){
                mergedList.add(i);
            }
        }
        for ( Person k : list2){
            if(! mergedList.contains(k)){
                mergedList.add(k);
            }
        }
        mergedList.sort(Comparator.comparing(Person::getAge));

        return mergedList ;
    }

    // TODO: Implement method to filter persons by a minimum age
    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        if (persons == null){
            persons = new ArrayList<>();
        }

        List<Person> filteredList = new ArrayList<>();

        for ( Person person : persons){
            if(person.getAge() >= minAge){
                filteredList.add(person);
            }
        }

        return filteredList;
    }

    // TODO: Implement method to calculate the average age of persons
    public static double calculateAverageAge(List<Person> persons) {
        if (persons == null || persons.isEmpty()){
            return 0;
        }

        double averageAge = 0.0;
        for ( Person person : persons){
            averageAge += person.getAge();
        }
        return averageAge / persons.size();
    }
}
