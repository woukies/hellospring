package io.github.woukies.p1025;

public class EvenNumber {
	private int number;

	public void process() {
		int sumEven = 0;
		for (int i = 0; i <= number; i += 2) {
			sumEven += i;
		}
		System.out.println(sumEven);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}