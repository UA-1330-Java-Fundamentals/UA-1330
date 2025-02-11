package com.softserve.edu07in;

public class B extends A {
    public int j = 456;

    public B() {
        super(444);
        System.out.println("Constructor public B()");
        //
        System.out.println("getI() = " + getI());
    }

    public void m1() {
        this.j = 111;
        super.j = 222;
    }

    @Override
    public String toString() {
        return "B { " +
                " j = " + j + // this.j
                " super.j = " + super.j +
                " }";
    }
}
