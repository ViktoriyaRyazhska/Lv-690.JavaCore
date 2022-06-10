package hm7;

public abstract class Person {

	FullName fullName = new FullName();
	private int age;
	
	private class FullName{
		
		private String firstNam;
		private String lastNam;
	}
	
    public Person(String firstN, String lastN, int age) {
        fullName.firstNam = firstN;
        fullName.lastNam = lastN;
        this.age = age;

    }
    public String getFirstNam() {
        return fullName.firstNam;
    }
    public String getLastNam() {
        return fullName.lastNam;
    }

	public int getAge() {
		return age;
	}



	public String info() {
        return "First name: <firstName>, Last name: <lastName>, Age: <age>";
    }
	 public abstract String activity();
	 
}

