package hw7.task2;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee("1", "Iryna", "1989", 3000);
        ContractEmployee emp2 = new ContractEmployee("6","Nikon", 100, 29,"5879053");
        SalariedEmployee emp3 = new SalariedEmployee("2", "Petr", "1989", 2500);
        ContractEmployee emp4 = new ContractEmployee("3","Mikol", 120, 70,"5879053");
        SalariedEmployee emp5 = new SalariedEmployee("4", "Oryna", "1989", 2200);
        ContractEmployee emp6 = new ContractEmployee("5","Nike", 110, 50,"5879053");



        Employee[] employees = new Employee[6];
        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;
        employees[5] = emp6;

        for (int i = 0; i < 6; i++){
            Employee employee = employees[i];
            Payment payment = (Payment) employees[i];
            System.out.println(employee.getEmployeeId() + " " + employee.getName()+ " " + payment.calculatePay());
        }

    }
}