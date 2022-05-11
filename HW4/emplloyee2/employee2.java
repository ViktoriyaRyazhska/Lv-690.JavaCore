package emplloyee2;

public class employee2 {
    String name;
    int department;
    int salary;

    public employee2(String name, int dep, int salary) {
        this.name = name;
        this.department = dep;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Name " + getName() + " Department " + getDepartment() + " Salary " + getSalary();

    }
}
