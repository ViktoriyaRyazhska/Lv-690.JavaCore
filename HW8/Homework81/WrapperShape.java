package Homework81;

public class WrapperShape <T1> implements Shape{
	private T1 shape;
	public WrapperShape(T1 shape) {
		this.shape = shape;
	}

	@Override
	public String get() {
		return "";
	}



}
