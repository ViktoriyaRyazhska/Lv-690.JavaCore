package Homework81;

import Homework83.Wrapper;

public class Main {

	public static void main(String[] args) {
		Square square = new Square("red square"); 
		WrapperShape<Square> squareWrapper = new WrapperShape<Square>(square);
		Circle circle = new Circle("green circle"); 
		WrapperShape<Circle> circleWrapper = new WrapperShape<Circle>(circle);
		System.out.println(square.get());
		System.out.println(circle.get());
	}

}
