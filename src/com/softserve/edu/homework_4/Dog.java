package com.softserve.edu.homework_4;

import java.util.Objects;

public class Dog {
    private final String name;
    private final Breed breed;
    private final int age;

    public enum Breed {
        GERMAN_SHEPHERD,
        BULLDOG,
        LABRADOR_RETRIEVER,
        GOLDEN_RETRIEVER,
        FRENCH_BULLDOG,
        SIBERIAN_HUSKY,
        BEAGLE,
        ALASKAN_MALAMUTE,
        POODLE,
        CHIHUAHUA,
        AUSTRALIAN_CATTLE_DOG,
        DACHSHUND,
        ROTTWEILER,
        AIREDALE_TERRIER,
        BORDER_COLLIE,
        AUSTRALIAN_SHEPHERD,
        AFFENPINSCHER,
        AMERICAN_STAFFORDSHIRE_TERRIER,
        MALTESE_DOG,
        BICHON_FRISE,
        ENGLISH_COCKER_SPANIEL,
        ANATOLIAN_SHEPHERD_DOG,
        AFGHAN_HOUND,
        AMERICAN_ESKIMO_DOG,
        YORKSHIRE_TERRIER,
        CHOW_CHOW,
        POMERANIAN,
        CAVALIER_KING_CHARLES_SPANIEL,
        PEMBROKE_WELSH_CORGI,
        BASSET_HOUND,
        BASENJI,
        HAVANESE,
        BELGIAN_SHEPHERD,
        NEWFOUNDLAND_DOG,
        BOSTON_TERRIER,
        CAIRN_TERRIER,
        BRITTANY_SPANIEL,
        SHELTIE,
        BLACK_RUSSIAN_TERRIER,
        BULLMASTIFF,
        BEDLINGTON_TERRIER,
        AMERICAN_PIT_BULL_TERRIER,
        SHIH_TZU,
        CANE_CORSO,
        DOBERMANN,
        SHIBA_INU,
        SAMOYED,
        SARABI_DOG,
        AMERICAN_BULLY,
        MALTIPOO,
        GOLDENDOODLE
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name = '" + name + '\'' +
                ", breed = " + breed +
                ", age = " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public static Dog getTheOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            return dog1;
        } else if (dog2.age > dog1.age && dog2.age > dog3.age) {
            return dog2;
        } else {
            return dog3;
        }
    }
}
