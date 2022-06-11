package com.softserve.javacore;

public class Developer extends Employee{

    private String position;

    public Developer() {}

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Developer developer = (Developer) o;

        return position != null ? position.equals(developer.position) : developer.position == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                "} " + super.toString();
    }

    @Override
    public String report() {
        return String.format("Name: %s, age: %d, , position: %s, salary: %.2f.", getName(), getAge(), getPosition(), getSalary());
    }
}
