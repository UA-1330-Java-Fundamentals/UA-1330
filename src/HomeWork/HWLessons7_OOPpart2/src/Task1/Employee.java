package Task1;

import java.util.Comparator;

public abstract class Employee {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }


}

