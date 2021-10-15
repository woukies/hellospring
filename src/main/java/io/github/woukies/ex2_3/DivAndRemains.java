package io.github.woukies.ex2_3;

public class DivAndRemains {
	private int number;

	public void process() {
		System.out.println("10의 자리와 1의 자리가 " + (number / 10 == number % 10 ? "같습니다." : "다릅니다"));
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
