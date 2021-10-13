package io.github.woukies;

public class MultipleTriangle {
	public static void main(String[] args) {
		Multiple multiple = new Multiple();
		multiple.setNumber(240);
		multiple.process();
		
		Triangle triangle = new Triangle();
		triangle.setA(4);
		triangle.setB(3);
		triangle.setC(5);
		triangle.process();
	}
}
