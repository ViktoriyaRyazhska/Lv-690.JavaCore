package HW7_InnerClasses;

public class Student extends Person {

    private int course;

    public static void main(String[] args) {

        Student[] students = createStudents();
        print(students);

    }
    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }


    public static Student[] createStudents(){

        Student[] students = new Student[2];
        students[0] = new Student(new FullName("Bob","Marley"),20,2);
        students[1] = new Student(new FullName("Fred","Mercury"),21,3);
        return students;
    }

    public static void print(Student[] students){

        for (Student st : students) {
            System.out.println(st.info());
            System.out.println(st.activity());
        }

    }

    @Override
    public String activity() {
        String text = "I study at the university";
        return text;
    }

    @Override
    public String info() {
        String text = super.info() + ", course: "+getCourse();
        return text;
    }

    @Override
    public FullName getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(FullName fullName) {
        super.setFullName(fullName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
