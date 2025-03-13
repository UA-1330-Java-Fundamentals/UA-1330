package hw7.task2;

abstract class Employee {
    private final String employeeId;
    private final String name;
    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getName(){
        return name;
    }
}