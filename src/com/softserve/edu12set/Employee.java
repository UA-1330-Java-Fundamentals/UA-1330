package com.softserve.edu12set;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    // implements Clonable
    // /*
    public static class ByNameAndId implements Comparator<Employee> {
        @Override
        public int compare(Employee em1, Employee em2) {
            if ((em1 == null) && (em2 == null)) {
                return 0;
            } else if (em1 == null) {
                return -1;
            } else if (em2 == null) {
                return 1;
            }
            int byName = em1.getName().compareTo(em2.getName());
            return byName == 0 ? em1.getId() - em2.getId() : byName;
        }
    }
    // */

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    private int id;
    private String name;

    public Employee() {
        id = 0;
        name = "";
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("\t\t\tequals done, this = " + this +"  o = " + o);
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        System.out.println("\t\thashCode done, o = " + this);
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // /*
    @Override
    public int compareTo(Employee employee) {
        //return name.compareTo(employee.getName());
        return id - employee.getId();
        // return 1;
    }
    // */

}
