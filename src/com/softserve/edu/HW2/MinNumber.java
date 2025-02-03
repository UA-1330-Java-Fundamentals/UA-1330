package com.softserve.edu.HW2;

public class MinNumber {
    public int number1;
    private int number2;
    private int number3;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }


    public int findSmallest (){
        return Math.min(number1, Math.min(number2, number3));
    }
}

