package homework7;

public class Wrapper<T> {
	private T value;

	public Wrapper(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Wrapper object1 = new Wrapper(1984); 
		Wrapper object2 = new Wrapper("Hola"); 
		Wrapper object3 = new Wrapper(false); 
		
		System.out.println(object1.getValue());
		System.out.println(object2.getValue());
		System.out.println(object3.getValue());
	}
}
