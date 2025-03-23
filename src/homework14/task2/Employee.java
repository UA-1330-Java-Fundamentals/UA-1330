package homework14.task2;

import java.util.Map;
import java.util.Optional;
import java.util.stream.*;

public class Employee {
    private String name;
    private String surname;

    static Optional<String> mostPopularName(Stream< Employee> employees) {

        if (employees == null) {
            return Optional.empty();
        }

        Map<String, Long> nameCount = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue()) // Пошук максимуму за значенням
                .map(Map.Entry::getKey);
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

