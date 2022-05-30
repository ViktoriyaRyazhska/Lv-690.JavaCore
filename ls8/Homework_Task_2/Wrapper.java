package ls8.Homework_Task_2;

public class Wrapper<T> {
	private T t;

	public Wrapper(T t) {
		this.t = t;
	}
	
	public void setValue(T t) {
		this.t = t;
	}
	
	public T getValue() {
		return t;
	}

}
