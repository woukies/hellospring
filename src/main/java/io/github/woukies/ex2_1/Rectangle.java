package io.github.woukies.ex2_1;

public class Rectangle {
	private int width, height;

	public void area() {
		System.out.println("�簢���� ������ " + (width * height));
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
