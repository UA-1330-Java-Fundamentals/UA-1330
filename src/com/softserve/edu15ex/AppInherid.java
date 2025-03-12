package com.softserve.edu15ex;

import java.io.IOException;

class Base {
    public void doSomething() throws IOException {
        System.out.println("Base");
        //throw new IOException("Base");
    }
}

class Child extends Base {
    @Override
    //public void doSomething() throws Exception { // Compile Error
    // public void doSomething() {  // Ok
    public void doSomething() throws IOException {  // Ok
        //public void doSomething() {  // Ok
        System.out.println("Child");
        super.doSomething();
    }
}


public class AppInherid {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            child.doSomething();
        } catch (IOException e) { // Compile Error
            System.out.println("IOException");
        } catch (Exception e) { // OK
            System.out.println("Exception");
            throw new RuntimeException(e);
        }
    }
}
