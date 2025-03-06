package homework8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Karyna", "Shevchenko"), 28 , 1330);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = new Student(new FullName("Anastasia", "Senko"), 25 , 1331);
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 =student1.clone();
        student3.setCourse(13);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println(student3.info());
        System.out.println(student3.activity());


    }
}
