package com.softserve.edu.HW2;

public class SmallestNumber {
    //here better have a static method findSmallest, which will return the smallest number
    //we can use Math.min method to find the smallest number

    /**
     * This method finds the smallest number among three numbers
     * @param n1 the numbers to compare
     * @param n2 the numbers to compare
     * @param n3 the numbers to compare
     * @return the smallest number
     */
    public static int findSmallest(int n1, int n2, int n3) {
        if (isAllEqual(n1, n2, n3)) {
            System.out.println("All numbers are equal");
            return n1;
        }
        return Math.min(Math.min(n1, n2), n3);
    }

    /**
     * This method checks if all numbers are equal
     * @param n1 the numbers to compare
     * @param n2 the numbers to compare
     * @param n3 the numbers to compare
     * @return true if all numbers are equal, false otherwise
     */
    private static boolean isAllEqual(int n1, int n2, int n3) {
        return n1 == n2 && n2 == n3;
    }

    //оголошення полів класу, конструктор - це вже зайва реалізація, оскільки ми можемо використати статичний метод
//і викликати його без створення об'єкта класу.
    int n1, n2, n3;

    public SmallestNumber(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int findSmallest() {
        int smallest = this.n1;

        if (this.n2 < smallest) {
            smallest = this.n2;
        }

        if (this.n3 < smallest) {
            smallest = this.n3;
        }

        return smallest;
    }
}
