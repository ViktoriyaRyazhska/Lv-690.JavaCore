package ls8.Homework_Task_1;

public class FullName {
	private String firstName;
	private String secondName;
	
	public FullName(String firstName, String secondName) {		
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	

}
