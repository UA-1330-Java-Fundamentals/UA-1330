package hw14.Streams;

import java.util.*;
import java.util.stream.Collectors;


public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;

    }
}

    class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            Employee empl1 = new Employee("Bob");
            Employee empl2 = new Employee("Din");
            Employee empl3 = new Employee("Sam");
            Employee empl4 = new Employee("Sam");
            employees.add (empl1);
            employees.add (empl2);
            employees.add (empl3);
            employees.add (empl4);

            Map<String, Long> mostPopularName = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

            List<String> mostPopularNameList = mostPopularName.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            System.out.println("The most popular name: " + mostPopularNameList);
        }
    }

