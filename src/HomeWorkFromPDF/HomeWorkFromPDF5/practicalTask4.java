/*
Create a class called Employee with fields: name, department number, salary.
• In main() method create five objects of class Employee.
• Output results for:
--all employees of a certain department (input department number in the console);
--arrange workers by the field salary in descending order.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Employee{
    private final String name;
    private final int departmentNumber;
    private int salary;

    private Employee[] departmentsNumber;

    public Employee(String name, int departmentNumber, int salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber(){
        return this.departmentNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public int setSalary(int salary){
        return this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && salary == employee.salary && Objects.equals(name, employee.name) && Objects.deepEquals(departmentsNumber, employee.departmentsNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departmentNumber, salary, Arrays.hashCode(departmentsNumber));
    }
}

public class practicalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] e = {
                new Employee("Adam", 221, 1300),
                new Employee("Bob", 222, 100),
                new Employee("Karl", 221, 1),
                new Employee("Carl", 225, 13300),
                new Employee("Rolan", 221, 200)
        };

        System.out.println("Введіть номер департаменту: ");
        int depNumberByUser = sc.nextInt();

        for (Employee emp : e) {
            if(depNumberByUser == emp.getDepartmentNumber()){
                System.out.println(emp);
            }
        }

        for(int i = 0; i < e.length - 1; i++){
            for(int j = 0; j < e.length - i - 1; j++){
                if (e[j].getSalary() < e[j + 1].getSalary()) {
                    Employee temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }

        System.out.println("Посортовані працівгики за ЗП: ");
        for (Employee emp : e) {
            System.out.println(emp);
        }



    }
}
