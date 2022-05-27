package work7.task2;

public class Wrapper<T> {
	T value;

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
	
}
