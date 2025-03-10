package com.softserve.edu15ex;

public class AppResource {

    public static void main(String[] args) {
        System.out.println("start");
        //
        try (MyResource sr = new MyResource()) {
            System.out.println("try ...");
            //throw new RuntimeException("hahaha");
        }
        catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
        finally {
            System.out.printf("finally done" );
        }

    }
}
