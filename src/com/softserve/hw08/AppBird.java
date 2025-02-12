package com.softserve.hw08;

public class AppBird {

    public static void main(String[] args) {
        //Bird[] birds = new Bird[] { new Eagle(), new Swallow(), new Penguin(), new Kiwi() };
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
        //
        for (Bird currentBird : birds) {
            System.out.println("currentBird = " + currentBird); // currentBird.toString();
        }
        //
        for (int i = 0; i < birds.length; i++) {
            System.out.println("\tcurrent  = " + birds[i]);
        }
    }
}
