package Employee_Developer;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format(super.report () + " Position: %s ", getPosition());
    }

    public static void main(String[] args) {
        Employee developer1 = new Employee("Taras", 32, 32735.35);
        System.out.println(developer1.report());
        Employee developer2 = new Developer("Ivan", 34, "Average Java developer", 34500.67);
        System.out.println(developer2.report());
    }

}
