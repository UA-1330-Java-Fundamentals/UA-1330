package com.softserve.edu08err.arch;

public class Parent {
    //protected int f() { // fix Error
    int f() {
        System.out.println("\tRunning f() from Parent");
        return 1;
    }

    public int useF() {
        return f();
    }

}
