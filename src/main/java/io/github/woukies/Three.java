package io.github.woukies;

public class Three {
	private int number;

	public void process() {
		System.out.println("3�� ���" + (number != 0 && number % 3 == 0 ? "�Դϴ�." : "�� �ƴմϴ�."));
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}