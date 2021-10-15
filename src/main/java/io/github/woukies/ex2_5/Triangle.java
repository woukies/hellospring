package io.github.woukies.ex2_5;

public class Triangle {
	private int a, b, c;

	public void process() {
		boolean isTriangle = false;
		if (a + b > c) {
			isTriangle = true;
		}
		if (a + c > b) {
			isTriangle = true;
		}
		if (b + c > a) {
			isTriangle = true;
		}

		if (isTriangle) {
			System.out.println("삼각형이 됩니다");
		} else {
			System.out.println("삼각형이 안됩니다");
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
