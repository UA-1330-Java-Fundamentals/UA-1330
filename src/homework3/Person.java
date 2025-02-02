package homework3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthYear;
    private static final LocalDate currentDate = LocalDate.now();

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getAge() {
        return Period.between( birthYear, currentDate).getYears();
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person firstname:");
        String firstname = scanner.nextLine();
        setFirstName(firstname);

        System.out.println("Input person lastname:");
        String lastname = scanner.nextLine();
        setLastName(lastname);
    }

    public void output(){
        System.out.println("FistName is " + getFirstName() + " , " + "LastName is " + getLastName());
    }

    public void changeName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();

        Person person2 = new Person();
        person2.input();

        Person person3 = new Person();
        person3.input();

        person2.output();

        person2.changeName("Karyna", "Shevchenko");
        person2.output();

    }
}
