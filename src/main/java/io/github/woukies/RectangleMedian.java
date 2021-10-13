package io.github.woukies;

public class RectangleMedian {
	public static void main(String[] args) {
		RectangleXY rectangleXY = new RectangleXY();
		rectangleXY.setX(150);
		rectangleXY.setY(150);
		rectangleXY.process();

		Median median = new Median();
		median.setNum1(20);
		median.setNum2(100);
		median.setNum3(33);
		median.process();
	}
}
