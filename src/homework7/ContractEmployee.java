package homework7;

public class ContractEmployee extends Employee implements Payment{
    double hourlyRate = 12.00;
    boolean federalTaxIdMember;
    double numberOfHoursWorked;


    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    public ContractEmployee(String name, String surname, boolean federalTaxIdMember, double hourlyRate, double numberOfHoursWorked, String employeeId) {
        this.name = name;
        this.surname = surname;
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.employeeId = employeeId;
    }
}
