package com.softserve.edu03oop1;

public class RunnerHelper {

    public static void main(String[] args) {
        Helper.setMessage("hello");
        Helper.print();
        //
        // Not recommended
//        Helper helper = new Helper();
//        helper.setMessage("new message");
//        helper.print();
    }
}
