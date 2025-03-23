package homework14.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob", "Moosa"),
                new Employee("Din", "Sibba"),
                new Employee("Sam", "Bart"),
                new Employee("Sam", "Feke")
        );

        // List<Employee> employees = Arrays.asList();

        Optional<String> popularName = Employee.mostPopularName(employees.stream());

        System.out.println(popularName.orElse("No names found"));
    }
}
