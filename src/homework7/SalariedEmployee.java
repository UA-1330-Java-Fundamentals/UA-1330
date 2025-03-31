package homework7;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double monthlyPayment;


    @Override
    public double calculatePay() {
        return monthlyPayment;
    }

    public SalariedEmployee(String name, String surname, String socialSecurityNumber, double monthlyPayment, String employeeId) {
        this.name = name;
        this.surname = surname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlyPayment = monthlyPayment;
        this.employeeId = employeeId;

    }
}
