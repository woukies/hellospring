package io.github.woukies;

public class Circle {
	private int radius;

	public void area() {
		System.out.println("원의 면적은 " + (radius * radius * 3.14));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
