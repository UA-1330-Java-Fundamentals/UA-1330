/*
5. Create a class called Dog that has the following fields: name, breed, age.
• Declare enum for field breed.
• In main() method create create three instances of type Dog.
o Check if there are no two dogs with the same name;
o Output the name and the breed of the oldest dog.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Objects;
import java.util.Scanner;

enum Breed{
    CHICHUAHUA, BULLDOG, LABRADOR
}

class Dog{
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public Breed getBreed(){
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}

public class homeWork5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Adam", Breed.BULLDOG, 24);
        Dog dog2 = new Dog("Bob", Breed.CHICHUAHUA, 19);
        Dog dog3 = new Dog("Carl", Breed.LABRADOR, 1);

        if(dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) || dog1.getName().equals(dog3.getName())){
            System.out.println("Імена собачок співпадають(");
        } else {System.out.println("Імена собачок не співпадають)");}

        Dog oldest = dog1;
        if(dog2.getAge() > oldest.getAge()){
            oldest = dog2;
        }
        if(dog3.getAge() > oldest.getAge()){
            oldest = dog3;
        }
        System.out.println("Найстарішим собакою є " + oldest.getName() + ", порода: " + oldest.getBreed());
    }
}
