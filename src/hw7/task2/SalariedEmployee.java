package hw7.task2;

public class SalariedEmployee extends Employee implements Payment{
    private final String socialSecurityNumber;
    private final int fixedMonthlyPayment;

    SalariedEmployee(String employeeId,
                     String name,
                     String socialSecurityNumber,
                     int fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    @Override
    public int calculatePay(){
        return fixedMonthlyPayment;
    }

}

