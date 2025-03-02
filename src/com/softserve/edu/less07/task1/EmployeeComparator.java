package com.softserve.edu.less07.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Payment> {
    @Override
    public int compare(Payment o1, Payment o2) {
        return  (int)(o2.calculatePay() - o1.calculatePay());
    }

}
