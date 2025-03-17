package Task1;

public class ContractEmployee extends Employee implements Payment {
    //private boolean  fixedPaidWorkers;
    private String federalTaxIdmember;
    private double fixedMonthlyPayment;

    //the average monthly salary = fixed monthly payment


    public ContractEmployee(String employeeId, String federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                ", employeeId='" + employeeId + '\'' +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }


}
