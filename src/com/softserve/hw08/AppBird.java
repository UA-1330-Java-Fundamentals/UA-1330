package com.softserve.hw08;

public class AppBird {

    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Swallow(), new Penguin(), new Kiwi() };
        //
        for (Bird currentBird : birds) {
            System.out.println("currentBird = " + currentBird);
        }
    }
}
