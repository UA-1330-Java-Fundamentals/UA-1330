/*1. Create a FullName class with the firstName and lastName fields of type String, which
would correspond to the principle of encapsulation.
• Create an abstract Personclass with fullName field of type FullName and age of type int.
• In the Person class, create:
o a constructor public Person(FullName fullName, int age) ;
o info() method, which will return a string in the format
"First name: <firstName>, Last name: <lastName>, Age: <age>"
o an abstract public activity() method with a String return type.

2. Create a Student class with an int field that matches the course the student is taking.
• In the Student class:
o create a constructor with parameters to initialize all fields in the class;
o override the info() method (which would also add course information to the
previous line);
o override the activity() method from the Person class. The activity() method should
return a string value that is the type of activity for the corresponding Person subtype,
for example for a student - this could be the value "I study at university".
• In the main() method, create two instances of the Student class and output information
about them by calling the appropriate methods info() and activity().
• Create one more instance of Student class by cloning the first student, change a course
for this object and output full information about created students.*/

package HomeWorkFromPDF.HomeWorkFromPDF8;

class FullName{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}

abstract class Person{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    abstract public String activity();
}

class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Student clone() throws CloneNotSupportedException{
        Student myClone = (Student) super.clone();
        return myClone;
    }
}

public class HomeWork1{
    public static void main(String[] args) throws Exception {
        Student student1 = new Student(new FullName("John", "Doe"), 20, 2);
        System.out.println(student1.activity());
        System.out.println(student1.info());

        Student student2 = student1.clone();
        student2.setCourse(34);
        System.out.println(student2.activity());
        System.out.println(student2.info());
    }
}
