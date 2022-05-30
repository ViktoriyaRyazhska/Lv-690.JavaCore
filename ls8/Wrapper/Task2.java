package ls8.Wrapper;
/*
 * Create Wrapper class which should wrap any objects which implements Shape interface
 */

public class Task2 {

	public static void main(String[] args) {
		Wrapper<Shape> circleWrapper = new Wrapper<>(new Circle(5));
		Wrapper<Shape> squareWrapper  = new Wrapper<>(new Square(5));
		Wrapper<String> stringWrapper = new Wrapper<>("Hello");
		
		System.out.println(circleWrapper.getT());
		System.out.println(squareWrapper.getT());
		System.out.println(stringWrapper.getT());

	}

}

