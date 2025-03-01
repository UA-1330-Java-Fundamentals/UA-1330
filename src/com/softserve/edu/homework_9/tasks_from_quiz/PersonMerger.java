package com.softserve.edu.homework_9.tasks_from_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    public static class ByAge implements Comparator<Person> {
        @Override
        public int compare(Person st1, Person st2) {
            return st1.getAge() - st2.getAge();
        }
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int compareTo(Person person) {
        return age - person.getAge();
    }
}

class PersonMerger {

    // TODO: Implement method to merge and sort persons by age
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        // Method should merge list1 and list2, remove duplicates, and sort by age in ascending order\
        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();

        List<Person> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        List<Person> resultList = new ArrayList<>();
        for (Person element : mergedList) {
            if (!resultList.contains(element)) {
                resultList.add(element);
            }
        }

        //sort
        resultList.sort(new Person.ByAge());

        return resultList;// Placeholder return statement
    }

    // TODO: Implement method to filter persons by a minimum age
    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        // Method should return a list of persons with age greater than or equal to minAge
        if (persons != null) {
            List<Person> resultList = new ArrayList<>();
            for (Person person : persons) {
                if (person.getAge() >= minAge) {
                    resultList.add(person);
                }
            }
            return resultList;
        } else {
            return new ArrayList<>();
        }
    }

    // TODO: Implement method to calculate the average age of persons
    public static double calculateAverageAge(List<Person> persons) {
        // Method should calculate and return the average age of persons in the list
        if (persons != null && !persons.isEmpty()) {
            double sumOfAllAges = 0.0;
            for (Person person : persons) {
                sumOfAllAges += person.getAge();
            }
            return sumOfAllAges / persons.size();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Person> list1 = List.of(new Person("Alice", 30), new Person("Bob", 25));
        List<Person> list2 = List.of(new Person("Charlie", 35), new Person("Bob", 25));

        List<Person> mergedAndSortedList = mergeAndSortPersons(list1, list2);
        System.out.println(mergedAndSortedList);

        System.out.println(filterByMinimumAge(mergedAndSortedList, 30));

        System.out.println(calculateAverageAge(mergedAndSortedList));
    }
}
