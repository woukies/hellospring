package io.github.woukies.ex2_3;

public class DivAndRemains {
	private int number;

	public void process() {
		System.out.println("10�� �ڸ��� 1�� �ڸ��� " + (number / 10 == number % 10 ? "�����ϴ�." : "�ٸ��ϴ�"));
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
