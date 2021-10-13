package io.github.woukies;

public class MyCircle2 {
	private Circle2 circle;
	private int radius;
	
	public void ar() {
		circle.area(radius);
	}
	
	public Circle2 getCircle() {
		return circle;
	}
	public void setCircle(Circle2 circle) {
		this.circle = circle;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
