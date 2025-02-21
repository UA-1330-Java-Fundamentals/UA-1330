/*
* 1. Create an interface called Payment with the method calculatePay(), the base
abstract class called Employee with a String variable employeeld.
o Create two classes, SalariedEmployee and ContractEmployee, which
implement Payment interface and inherit from the base class Employee.
• Describe hourly-paid workers in the relevant classes (one of the child
classes), and fixed paid workers in the other.
• Describe the String variable socialSecurityNumber in the
SalariedEmployee class .
• Include a description of federalTaxIdmember variable in the
ContractEmployee class.
• The calculation formula for the hourly workers is as follow:
the average monthly salary = hourly rate * number of hours worked
• For employees with a fixed salary the formula is simply:
the average monthly salary = fixed monthly payment
o In main() method create an array of employees and add the employees
with different form of payment.
o Arrange the entire sequence of workers in descending order of the average
monthly wage. Output the employee ID, name, and the average monthly
wage for all elements of the list.
* */

package HomeWorkFromPDF.HomeWorkFromPDF7;

import java.util.Arrays;
import java.util.Comparator;

interface Payment{
    int calculatePay();
}

abstract class Employee{
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

class SalariedEmployee extends Employee implements Payment {
    int monthlySalary;
    String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int monthlySalary) {
        super.setEmployeeId(employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }
}

class ContractEmployee extends Employee implements Payment {
    int hourlyPaying;
    int federalTaxIdMember;
    int workingHours;

    public ContractEmployee(String employeeId, int hourlyPaying, int federalTaxIdMember, int workingHours) {
        super.setEmployeeId(employeeId);
        this.hourlyPaying = hourlyPaying;
        this.federalTaxIdMember = federalTaxIdMember;
        this.workingHours = workingHours;
    }

    @Override
    public int calculatePay() {
        return hourlyPaying * workingHours;
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(((Payment) e2).calculatePay(), ((Payment) e1).calculatePay());
    }
}



public class HomeWork1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("12", 1200, 1334334, 4),
                new ContractEmployee("2", 700, 5325775, 19),
                new SalariedEmployee("1", 24000),
                new SalariedEmployee("10", 12000)
        };

        Arrays.sort(employees, new EmployeeComparator());

        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEmployeeId() +
                    ", Salary: " + ((Payment) emp).calculatePay());
        }
    }
}
