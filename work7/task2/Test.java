package work7.task2;

public class Test {

	public static void main(String[] args) {
		Wrapper<Integer> w1 = new Wrapper<Integer>(54);
		Wrapper<String> w2 = new Wrapper<String>("its me mario");
		Wrapper<Boolean> w3 = new Wrapper<Boolean>(true);
		
		System.out.println(w1.getValue());
		System.out.println(w2.getValue());
		System.out.println(w3.getValue());
	}

}
