package homework7;

public abstract class Employee implements Payment{
    String employeeId;
    String name;
    String surname;

    @Override
    public String toString() {
        return "EmployeeId: " + employeeId + ", name: " + name + ", surname: " + surname + ", the average monthly salary: " + calculatePay();
    }
}
