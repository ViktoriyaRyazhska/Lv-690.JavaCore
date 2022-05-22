package Homework83;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> t1 = new Wrapper<Integer>(); 
		t1.setValue(12);
		Wrapper<String> t2 = new Wrapper<String>();
		t2.setValue("**");
		Wrapper<Boolean> t3 = new Wrapper<Boolean>();
		t3.setValue(true);
		System.out.println(t1.getValue()+" "+t2.getValue()+" "+t3.getValue());
	}
}
