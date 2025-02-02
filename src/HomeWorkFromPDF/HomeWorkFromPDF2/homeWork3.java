/*
Create Console Application and add class called Person to the project. Class Person should consist of:
• three private fields: firstName, lastName and birthYear (the birthday year);
• properties for access to these fields;
• default constructor and constructor with 2 parameters (first and last names);
• Methods:
    • (**) getAge ()- to calculate the age of a person;
    • input ()- to input information about the person;
    • output ()- to output information about the person;
    • changeName(String fn, String ln) - to change the first name or/and last name.
In the main() method create 5 objects of Person type and input information about them to console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF2;

import java.time.LocalDate;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirtsName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(int birthYear){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;
        return age;
    }

    public String toString(){
        return "Person {" +
                    "\tfirstName: " + this.firstName +
                    "\tlastName: " + this.lastName +
                    "\tbirthYear: " + this.birthYear +
                "}";
    }

    public void changeName(Scanner sc){
        System.out.println("Доброго дня, вітаю Вас в центрі зміни імені. \n");
        System.out.println("Введіть імя для зміни або пропустіть поле:");
        String fn = sc.nextLine();
        System.out.println("Введіть прізвище для зміни або пропустіть поле:");
        String ln = sc.nextLine();

        if (!fn.isEmpty()) { // хотів використати if fn == "", але це не спрацювало, і наскільки я визначив, це через те, що джава порівнює посилання на обєкти. А В ПАМЯТІ МОЖУТЬ БУТИ СТВОРЕННІ ДВА РІЗНИХ пустих рядка, тому вони і відрізняються, тож в такому випадку використовується isEmpty.
            setFirtsName(fn);
        }

        if (!ln.isEmpty()) {
            setLastName(ln);
        }
    }

}

public class homeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person();
        person1.setFirtsName("Ben");
        person1.setLastName("Gordon");
        person1.setBirthYear(2000);

        Person person2 = new Person("Yan", "Mell");
        person2.setBirthYear(2003);

        Person person3 = new Person("Den", "Mell");
        person3.setBirthYear(1245);

        Person person4 = new Person();
        person4.setFirtsName("Adam");
        person4.setLastName("Gordon");
        person4.setBirthYear(3);

        Person person5 = new Person("Ron", "Crocodilovich");
        person5.setBirthYear(2006);

        System.out.println("Перша людина на імя: " + person1.getFirstName() +
                ", носить прізвище: " + person1.getLastName() +
                ", а народилась у: " + person1.getBirthYear() +
                ", тож вік становить: " + person1.getAge(person1.getBirthYear()));

        System.out.println("Друга людина на імя: " + person2.getFirstName() +
                ", носить прізвище: " + person2.getLastName() +
                ", а народилась у: " + person2.getBirthYear() +
                ", тож вік становить: " + person2.getAge(person2.getBirthYear()));

        System.out.println("Третя людина на імя: " + person3.getFirstName() +
                ", носить прізвище: " + person3.getLastName() +
                ", а народилась у: " + person3.getBirthYear() +
                ", тож вік становить: " + person3.getAge(person3.getBirthYear()));

        System.out.println("Четверта людина на імя: " + person4.getFirstName() +
                ", носить прізвище: " + person4.getLastName() +
                ", а народилась у: " + person4.getBirthYear() +
                ", тож вік становить: " + person4.getAge(person4.getBirthYear()));

        System.out.println("Пята людина на імя: " + person5.getFirstName() +
                ", носить прізвище: " + person5.getLastName() +
                ", а народилась у: " + person5.getBirthYear() +
                ", тож вік становить: " + person5.getAge(person5.getBirthYear()));

        person5.changeName(sc);
        System.out.println("персона після зміни: " + person5);
    }
}
