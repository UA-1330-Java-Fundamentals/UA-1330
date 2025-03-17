package Task1;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(((Payment) e2).calculatePay(), ((Payment) e1).calculatePay());
    }
}

