package HW8.task1;

public class FullName {
	private String firstName;
	private String lastName;
	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFullName() {
		return "firstName=" + firstName + ", lastName=" + lastName;
	}
	

}