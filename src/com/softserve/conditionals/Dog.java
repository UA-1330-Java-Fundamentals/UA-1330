package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addADog(String prompt1,String prompt2, String prompt3) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt1);
        String d1Name = br.readLine();
        setName(d1Name);
        System.out.print(prompt2);
        int d1Age = Integer.parseInt(br.readLine());
        setAge(d1Age);
        System.out.print(prompt3);
        String d1Breed = (br.readLine().toLowerCase());
        Dog.Breed d1BreedValue = Dog.Breed.getBreedName(d1Breed);
    }

    enum Breed{
        GERMANSHEPHERD("German Shepherd"),
        POODLE("Poodle"),
        FRENCHBULLDOG("French Bulldog"),
        SPITZ("Spitz"),
        YORK("Yorkshire Terrier"),
        MONGREL("Mongrel dog");

        private String breedName;

        Breed(String breedName){
            this.breedName = breedName;
        }
  /*
        public String getBreedName() {
            return breedName;
        } */

       static Breed getBreedName(String breedName) {
            return switch (breedName) {
                case "german shepherd" -> Breed.GERMANSHEPHERD;
                case "poodle" -> Breed.POODLE;
                case "french bulldog" -> Breed.FRENCHBULLDOG;
                case "spitz" -> Breed.SPITZ;
                case "yorkshire terrier" -> Breed.YORK;
                default -> Breed.MONGREL;
            };
        }

        @Override
        public String toString() {
            return "The dog's breed is " + breedName + '\'';
        }
    }

}
