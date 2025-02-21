/*
Realize next structure of classes. In abstract class
Person with property name, declare abstract
method print(). In other extended classes in body of
method print() output text “I am a …
”
. In class Staff
declare abstract method salary(). In each concrete
class create constant TYPE_PERSON. Output type of
person in each constructors. In main() method
create an array of Person and add some Teachers,
Cleaners and Students. Call method print() for all of
it. Call method salary() for all Teachers and Cleaners.
*/

package HomeWorkFromPDF.HomeWorkFromPDF7;

abstract class Person{
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }

    abstract void print();
}

class Student extends Person{
    public static final String TYPE_PERSON = "Student";

    public Student(String name){
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print(){
        System.out.println("I am a Student");
    }
}

abstract class Staff extends Person {
    public static final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Staff");
    }

    public abstract double salary();
}

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }

    @Override
    public double salary() {
        return 5000;
    }
}

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner");
    }

    @Override
    public double salary() {
        return 6000;
    }
}

public class PracticalTask2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Cleaner("Bob"),
                new Teacher("Elan"),
                new Student("Yra")
        };

        for (Person person : persons){
            person.print();
            if (person instanceof Staff){
                System.out.println("Salary: " + ((Staff) person).salary());
            }
        }
    }
}
