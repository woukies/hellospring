package io.github.woukies.ex2_1;

public class Circle {
	private int radius;

	public void area() {
		System.out.println("���� ������ " + (radius * radius * 3.14));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
