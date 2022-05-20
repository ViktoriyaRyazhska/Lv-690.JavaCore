package HomeWork.Person;

public abstract class Person {
    private FullName fullName = new FullName();
    private int age;

    public Person(String firstN, String lastN, int age) {
        fullName.firstname = firstN;
        fullName.lastName = lastN;
        this.age = age;

    }

    public String getFirstName() {
        return fullName.firstname;
    }

    public String getLastName() {
        return fullName.lastName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: <firstName>, Last name: <lastName>, Age: <age>";
    }

    public String activity() {
        return "";
    }

    private class FullName {
        private String firstname;
        private String lastName;
    }


}
