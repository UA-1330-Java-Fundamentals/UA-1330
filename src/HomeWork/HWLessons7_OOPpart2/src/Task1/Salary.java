package Task1;

import java.util.ArrayList;
import java.util.List;


public class Salary {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        list.add(new SalariedEmployee("Irina", "6577", 70, 198));
        list.add(new ContractEmployee("Nona", "4643", 1000));
        list.add(new SalariedEmployee("Dmytro", "6444", 68, 189));

        list.sort(new SalaryComparator());

        for (Employee employee : list) {
            System.out.println(employee);
            System.out.println("Salary: " + ((Payment) employee).calculatePay());

        }


    }


}

