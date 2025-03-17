package Task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int hourlyWorked;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourlyRate, int hourlyWorked) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }

    //the average monthly salary = hourly rate * number of hours worked


    @Override
    public double calculatePay() {
        return hourlyRate * hourlyWorked;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                ", employeeId='" + employeeId + '\'' +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hourlyWorked=" + hourlyWorked +
                '}';
    }
}
