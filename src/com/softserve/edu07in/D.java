package com.softserve.edu07in;

public class D {
    public int m = 456;
    public C c = new C();

    public D() {
        System.out.println("Constructor public D()");
        //
        System.out.printf("c.k = " + c.k);
    }
}
