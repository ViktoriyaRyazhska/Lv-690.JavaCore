package hm6;

public class SalariedEmployee extends Employee implements Payment {
		private int socialSecurityNumber;
		private int hourse;
		private int paid;
		private String Name;
		
		
	public String getName() {
			return Name;
		}

	public SalariedEmployee(int socialSecurityNumber, int hourse, int paid , String Name) {
			super();
			this.socialSecurityNumber = socialSecurityNumber;
			this.hourse = hourse;
			this.paid = paid;
		}

	@Override
	public int calculatePay() {
		return (paid * hourse);
	}
}
