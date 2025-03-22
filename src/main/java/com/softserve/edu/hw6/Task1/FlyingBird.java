package com.softserve.edu.hw6;

abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}

public class FlyingBird extends Bird {
    public FlyingBird (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can fly");
    }
}

public class Eagle extends FlyingBird {
    public Eagle (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}

public class Swallow extends FlyingBird {
    public Swallow (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Swallow can fly");
    }
}

public class NonflyingBird extends Bird {
    public NonflyingBird (String feathers, boolean layEggs) {
    super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird can't fly");
    }
}

public class Penguin extends NonflyingBird {
    public Penguin (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }
}

public class Kiwi extends NonflyingBird {
    public Kiwi (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi can't fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle("Brown feathers", true);
        birds[1] = new Swallow("Blue feathers", true);
        birds[2] = new Penguin("Black and white feathers", true);
        birds[3] = new Kiwi("Brown feathers", true);

        for (Bird bird : birds) {
            bird.fly();
        }

        for (Bird bird : birds) {
            System.out.println("Feathers: " + bird.feathers + ", Lay Eggs: " + bird.layEggs);
        }
    }
}


