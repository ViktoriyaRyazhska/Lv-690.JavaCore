package com.softserve.javacore;

public abstract class Person {
    private final FullName fullName;
    private final int age;

    protected static class FullName {
        private final String firstName;
        private final String lastName;

        FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.firstName, fullName.lastName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + fullName.firstName +
                ", lastName=" + fullName.lastName +
                ", age=" + age +
                '}';
    }


    public abstract String activity();
}
