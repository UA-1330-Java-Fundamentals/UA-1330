package com.softserve.edu07in;

public class A { //extends Object {
    private int i = 123;
    protected int j = 777;

    public A() {
        System.out.println("Constructor public A()");
    }

    public A(int i) {
        this();
        this.i = i;
        System.out.println("\tConstructor public A(int i)");
    }

    public int getI() {
        return i;
    }
}
