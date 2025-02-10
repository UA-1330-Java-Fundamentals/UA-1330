package com.softserve.edu.HW3Lesson4ConditionStatements;


class Dog {
    enum Breed {
        LABRADOR, BULLDOG, BEAGLE, POODLE, SHEPHERD
    }

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public static boolean nameChecker(Dog dog1, Dog dog2, Dog dog3) {

        if (dog1.getName().equals(dog2.getName())) {
            return true;
        } else if (dog1.getName().equals(dog3.getName())) {
            return true;
        } else {
            return false;
        }

    }

    public static Dog getOldesDog(Dog dog1, Dog dog2, Dog dog3) {

        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            return dog1;
        } else if (dog2.age > dog1.age && dog2.age > dog3.age) {
            return dog2;
        } else {
            return dog3;
        }

    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }
}

