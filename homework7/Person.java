package homework7;

public abstract class Person {
	FullName fullName = new FullName();
	private int age;
	
	public Person(String firstN, String lastN, int age) {
        fullName.firstn = firstN;
        fullName.lastn = lastN;
        this.age = age;
	}
	private class FullName{
		private String firstn;
        private String lastn;
	}
	
	
	public String info() {
		return "First name: <firstName>, Last name: <lastName>, Age: <age>";   
	}
	public abstract String activity();
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstn() {
        return fullName.firstn;
    }
	
	public String getLastn() {
        return fullName.lastn;
    }
}
