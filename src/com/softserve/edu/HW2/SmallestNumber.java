package com.softserve.edu.HW2;

public class SmallestNumber {

    int n1, n2, n3;

    public SmallestNumber(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int findSmallest() {
        int smallest = this.n1;

        if ( this.n2 < smallest) {
            smallest =  this.n2;
        }

        if ( this.n3 < smallest) {
            smallest =  this.n3;
        }

        return smallest;
    }
}
