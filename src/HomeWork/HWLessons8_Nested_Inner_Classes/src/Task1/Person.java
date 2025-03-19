package Task1;

public abstract class Person implements Cloneable {

    private FullName fullName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + getAge();
    }

    public abstract String activity();

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person myClone = (Person) super.clone();
        myClone.setFullName(getFullName().clone());
        return myClone;
    }
}


