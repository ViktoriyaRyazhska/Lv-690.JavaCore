package HW8.task2;

public class Wrapper<T> {
	private T t;

	public T getValue() {
		return t;
	}

	public void setValue(T t) {
		this.t = t;
	}
}