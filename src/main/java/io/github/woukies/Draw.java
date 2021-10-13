package io.github.woukies;

public class Draw {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		circle.area();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(20);
		rectangle.setHeight(30);
		rectangle.area();
	}
}
