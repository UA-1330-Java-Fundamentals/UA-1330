package com.softserve.edu.less06.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(100, 50),
                new Swallow(200, 50),
                new Penguin(10000, 1),
                new Kiwi(10000, 2)
        };
        for (Bird bird : birds) {
            System.out.println(STR."\{bird}-> \{bird.fly()}");
        }
    }
}
