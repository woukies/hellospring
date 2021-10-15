package io.github.woukies.q3_5;

public class MyThree {
	private Three three;
	private int number;

	public void pc() {
		three.process(number);
	}

	public Three getThree() {
		return three;
	}

	public void setThree(Three three) {
		this.three = three;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
