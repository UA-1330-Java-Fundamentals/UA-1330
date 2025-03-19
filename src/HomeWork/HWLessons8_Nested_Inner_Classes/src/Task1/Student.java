package Task1;

public class Student extends Person {
    private int course;

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course information: " + course;
    }

    public String activity() {
        return "\t I study at university ";
    }
}


