package com.softserve.edu.less07.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> employees = new ArrayList<>();
        employees.add(new ContractEmployee("1","123",100,160));
        employees.add(new ContractEmployee("2","456",120,100000));
        employees.add(new ContractEmployee("3","789",90,130));
        employees.add(new SalariedEmployee("4",111.00,50000.00));
        employees.add(new SalariedEmployee("5",123.00,560000.00));
        employees.add(new SalariedEmployee("6",150.00,60000.00));

        employees.sort(new EmployeeComparator());
        for (Payment employee : employees) {
            System.out.println(employee);
        }

    }
}
