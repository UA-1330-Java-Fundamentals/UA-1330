package com.softserve.edu.homework6_OOP_Part1.task1;

 abstract class Bird {

        protected boolean feathers;
        protected boolean layEggs;

        public Bird(boolean feathers, boolean layEggs) {
            this.feathers = feathers;
            this.layEggs = layEggs;
        }


    public abstract void fly();

}

