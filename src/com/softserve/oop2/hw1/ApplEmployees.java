package com.softserve.oop2.hw1;

import com.softserve.interfases.sorting.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ApplEmployees {
    public static class PaymentComparator implements Comparator<Payment> {
        @Override
        public int compare(Payment p1, Payment p2) {
            return Double.compare(p1.calculatePay(), p2.calculatePay());
        }
    }
    public static void main(String[] args) {
        Payment[] employees = {
                new SalariedEmployee("1", "Jack", "US111", 2555.5),
                new SalariedEmployee("2", "Mary", "US838", 3000.00),
                new SalariedEmployee("3", "Jerry", "US225", 8015.99),
                new ContractEmployee("7", "Anne", "FT2345", 15, 85),
                new ContractEmployee("88", "Gary", "FT1357", 45, 60),
                new ContractEmployee("153", "Alice", "FT7878", 15, 100),
                new ContractEmployee("245", "Cecilie", "FT8809", 30, 50),
                new ContractEmployee("334", "Elias", "FT7321", 50, 70)
        };

        for (Payment currentEmployee : employees) {
                double monthlyWage = ((Payment) currentEmployee).calculatePay();
                System.out.println(currentEmployee.toString() + " ,Monthly Wage: " + monthlyWage);
        }
        System.out.println(" ");
        Arrays.sort(employees, new PaymentComparator());
        for (Payment payment : employees) {
            System.out.println(payment.toString() + " ,Monthly Wage: " + payment.calculatePay());
        }
    }
}
