package io.github.woukies;

public class Three {
	private int number;

	public void process() {
		System.out.println("3의 배수" + (number != 0 && number % 3 == 0 ? "입니다." : "가 아닙니다."));
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}