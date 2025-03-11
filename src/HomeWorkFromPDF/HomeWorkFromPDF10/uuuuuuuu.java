package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.*;

public class uuuuuuuu{
    public static void main (String s[]){
        List<Student1> list = new LinkedList<Student1>();
        list.add (new Student1("Igor"));
        list.add (new Student1("Oleksandra"));
        list.add (new Student1("Anton"));
        Collections.sort(list);
        System.out.println(list);
    }
}

class Student1 implements Comparable<Student1>{
    private String name;
    public Student1(String name) { this.name = name; }

    @Override
    public String toString() { return name; }

    @Override
    public int compareTo(Student1 st) {
        return st.name.compareTo(this.name);
    }
}
