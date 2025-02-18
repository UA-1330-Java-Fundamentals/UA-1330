/*
Create a class called Developer that extends the Employee class. Define a String field
and a constructor to initialize all fields in the Developer class.
• In the Developer class, override the report() method to return a string with information
about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
• If necessary, modify the Employee class to adhere to the principles of encapsulation and
inheritance.
• In main() method create an instance of both the Employee and Developer classes and
print information about them in the console using report() method.
*/

package HomeWorkFromPDF.HomeWorkFromPDF6;

class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Salary: \u20B4 %.2f.", name, age, salary);
    }
}

class Developer extends Employee{
    private String companyName;

    public Developer(String name, int age, double salary, String companyName){
        super(name, age, salary);
        this.companyName = companyName;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f, Company: %s.",
                super.getName(), super.getAge(), super.getSalary(), this.companyName);
    }

}

public class HomeWork2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Taras", 79, 200);
        Employee employee2 = new Employee("Petro", 44, 2000);
        Developer developer1 = new Developer("Oleg", 23, 500, "Tesla");
        Developer developer2 = new Developer("Yana", 18, 1200, "BMW");

        System.out.println(employee1.report());
        System.out.println(employee2.report());
        System.out.println(developer1.report());
        System.out.println(developer2.report());
    }

}
