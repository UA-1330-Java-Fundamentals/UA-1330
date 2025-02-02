/*Create class called Employee that should consist of:
• three private fields: name, rate and hours;
• a static field called totalSum
• properties to access these fields;
• a default constructor and two constructors with parameters;
• Methods:
    o getSalary() - to calculate the salary of an employee (formula rate * hours);
    o toString() - to output information about the employee;
    o getBonuses() – to calculate 10% from salary.
In the main() method create 3 objects of type Employee, input information about them.
Display the total salary of all employees to the console.*/

package HomeWorkFromPDF.HomeWorkFromPDF2;

class Employee {
    private static double totalSum = 0.0;

    private String name;
    private double rate;
    private int hours;

    public Employee(){

    }

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, int hours, double rate){
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHours(int hours) {
        double prevSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum -= prevSalary;
        totalSum += newSalary;
    }

    public void setRate(double rate) {
        double prevSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum -= prevSalary;
        totalSum += newSalary;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "name: " + name +
                ", rate: " + rate +
                ", hours: " + hours +
                ", salary: " + getSalary() +
                ", bonuses: " + getBonuses() +
                "}";
    }
}

public class practicalTask2 {

    public static void main(String[] args) {
        Employee mcDonaldsEmployee = new Employee();
        mcDonaldsEmployee.setName("Andre");
        mcDonaldsEmployee.setHours(4);
        mcDonaldsEmployee.setRate(2.0);

        Employee monobankEmployee = new Employee("Jake");
        monobankEmployee.setHours(2);
        monobankEmployee.setRate(5.3);

        Employee softServeEmployee = new Employee("Jon", 2, 4.0);

        System.out.println(mcDonaldsEmployee);
        System.out.println(monobankEmployee);
        System.out.println(softServeEmployee);

        System.out.println("Сума усіх зарплат: " + Employee.getTotalSum());
    }
}
