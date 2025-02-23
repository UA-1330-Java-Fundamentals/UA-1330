package com.softserve.edu.HW6;

public class MainBirds {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

        for (Bird currentBird : birds) {
            currentBird.displayBirdInfo();
        }
    }
}


