package com.softserve.edu.less08.task1;

public abstract class Person {

    public static class FullName implements Cloneable {
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

        @Override
        public FullName clone() {
            try {
                return (FullName) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }

    public abstract String activity();

    private FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullName.getFirstName()
                + ">, Last name: <" + fullName.getLastName()
                + ">, Age: <" + getAge() + ">";
    }
}
