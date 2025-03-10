package com.softserve.edu15ex;

public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
    //public void close() {
        System.out.println("MyResource Closing ... ");
    }

}
