package Task1;

public class Application {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Anna", "Novikova", 17, 2);
        Student student2 = new Student("Olha", "Ivanova", 18, 3);

        System.out.println("Student 1: " + student1.info() + student1.activity());
        System.out.println("Student 2: " + student2.info() + student2.activity());

        Student student3 = (Student) student1.clone();
        student3.setCourse(4);
        System.out.println("Student 3: " + student3.info() + student3.activity());
        System.out.println("Student 1: " + student1.info() + student1.activity());


    }

}
