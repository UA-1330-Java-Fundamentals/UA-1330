package com.softserve.edu;

import java.util.List;

/** and */
public class Main {
    /* Comment */
    private int k = 11;

    /** and <font color="red">Hello</font> <b>World</b>>*/
    public static void main(String[] args) {
        /* This is a sample class which is used to demonstrate the
         use of multi-line comments. This comment does not appear
          in the java documentation. */
        System.out.println("Hello, World!");
        //
        int i = 49;
        System.out.println("i = " + i + " as char = " + (char) i);
        //
        // This example demonstrates the use of single line comments
        Main m1 = new Main();
        System.out.println("m1.k = " + m1.k);
        m1.k = 12;
        //
        Main m2 = new Main();
        m2.k = 22;
        System.out.println("m2.k = " + m2.k);
        //
        System.out.println("m1.k = " + m1.k);
        //
        m1 = m2;
        System.out.println("\"m1.k = " + m1.k);
        //
        List<?> lst;
        //java.awt.event.ActionEvent myEvent = new java.awt.event.ActionEvent(); // invalid solution
    }

}
