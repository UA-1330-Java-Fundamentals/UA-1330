package homework7;
/*
    Create an interface called Payment with the method calculatePay(), the base
abstract class called Employee with a String variable employeeId.
    Create two classes, SalariedEmployee and ContractEmployee, which
implement Payment interface and inherit from the base class Employee.
• Describe hourly-paid workers in the relevant classes (one of the child
classes), and fixed paid workers in the other.
• Describe the String variable socialSecurityNumber in the
SalariedEmployee class .
• Include a description of federalTaxIdMember variable in the
ContractEmployee class.
    The calculation formula for the hourly workers is as follows:
the average monthly salary = hourly rate * number of hours worked
• For employees with a fixed salary the formula is simply:
the average monthly salary = fixed monthly payment
    In main() method create an array of employees and add the employees
with different form of payment.
    Arrange the entire sequence of workers in descending order of the average
monthly wage. Output the employee ID, name, and the average monthly
wage for all elements of the list.
 */
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Anna", "Belimova", true, 12.00, 120.00, "101"),
                new ContractEmployee("Root", "Hogan",false, 15.00, 60.00, "102"),
                new SalariedEmployee("Phillipa","Crossan","878787", 1300.00, "1001"),
                new SalariedEmployee("Tomas", "Pearce", "09172849", 1500.00, "1002")
        };

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }
    }



}
