package hw7.task2;

public class ContractEmployee extends Employee implements Payment {
    private final String federalTaxIdmemeber;
    private final int numbersOfHours;
    private final int hourlyRate;

    ContractEmployee(String employeeId, String name, int numbersOfHours, int hourlyRate, String federalTaxIdmemeber) {
        super(employeeId, name);
        this.numbersOfHours = numbersOfHours;
        this.hourlyRate = hourlyRate;
        this.federalTaxIdmemeber = federalTaxIdmemeber;
    }

    @Override
    public int calculatePay() {
        return numbersOfHours * hourlyRate;
    }
}
