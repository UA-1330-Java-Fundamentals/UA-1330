package Task3;
import java.util.ArrayList;
import java.util.List;

public class PersonAppl {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Alice", 30));
        list1.add(new Person("Bob",25));
        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Charlie", 35));
        list2.add(new Person("Bob",25));

        System.out.println("mergeAndSortPersons " + PersonMerger.mergeAndSortPersons(list1, list2));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob",25));
        persons.add(new Person("Charlie", 35));

        System.out.println("" + PersonMerger.filterByMinimumAge(persons, 30));
        //System.out.println("persons " + persons);

        System.out.println("calculateAverageAge" + PersonMerger.calculateAverageAge(persons));




    }
}
