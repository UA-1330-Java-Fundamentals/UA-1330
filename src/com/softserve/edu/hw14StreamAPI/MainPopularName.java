package com.softserve.edu.hw14StreamAPI;
import java.util.List;
import java.util.Optional;
import static com.softserve.edu.hw14StreamAPI.PopularName.mostPopularName;

public class MainPopularName {
    public static void main(String[] args) {
        //for test with the same max count several names
        /*List<Employee> employees = List.of(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Charlie"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Bob")
        );*/

        //for test with empty stream
        //List<Employee> employees = List.of();

        List<Employee> employees = List.of(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Charlie"),
                new Employee("Bob"),
                new Employee("Alice")
        );

        System.out.println("All employees:");
        employees.forEach(System.out::println);

        Optional<String> mostPopular = mostPopularName(employees.stream());
        System.out.println("Most popular name: " + mostPopular.orElse("No popular name found"));

    }
}
