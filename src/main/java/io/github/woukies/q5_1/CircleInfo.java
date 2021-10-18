package io.github.woukies.q5_1;

public class CircleInfo {
	private Circle circle;

	public CircleInfo(Circle circle) {
		this.circle = circle;
	}

	public void getCircleInfo() {
		if (circle != null) {
			System.out.println("������: " + circle.getRadius());
			System.out.println("���� ����: " + circle.process());
		}
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
