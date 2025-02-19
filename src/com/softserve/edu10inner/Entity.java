package com.softserve.edu10inner;

class Entity {

    private static class Counter { // Nested Class
        private void setCount() {
            count = count + 1;
            // num++; // Compile Error
        }
    }

    //---------------------------------------------

    private static int count = 0;
    private static Counter counter;

    private int num = 1;

    static {
        counter = new Counter();
        System.out.println("static block done");
    }

    static {
        System.out.println("static block2 done");
    }

    public Entity() {
        // new Counter().setCount();
        counter.setCount();
        System.out.println("Entity() constructor done");
    }

    public static int getCount() {
        return count;
    }

}
