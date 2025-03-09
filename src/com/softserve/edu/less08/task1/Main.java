package com.softserve.edu.less08.task1;

import java.util.ArrayList;
import java.util.List;

/*
o переопределите метод activity() из класса Person. Метод activity() должен
возвращать строковое значение, которое является типом активности для соответствующего подтипа Person,
например, для студента - это может быть значение "Я учусь в университете".
• В методе main() создайте два экземпляра класса Student и выведите информацию
о них, вызвав соответствующие методы info() и activity().
• Создайте еще один экземпляр класса Student, клонировав первого студента, измените курс
для этого объекта и выведите полную информацию о созданном студента
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Student student1 = new Student(new Person.FullName("Mariia","Malyhina"),28,5);
       System.out.println(student1.info());
       Student student2 = new Student(new Person.FullName("Kostia","Malyhin"),17,3);
       System.out.println(student2.info());
       Student student3 = (Student) student1.clone();
       student3.setCourse(2);
       System.out.println(student3.info());

    }
}
