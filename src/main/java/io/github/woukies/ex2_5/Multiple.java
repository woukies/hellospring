package io.github.woukies.ex2_5;

public class Multiple {
	private int number;

	public void process() {
		boolean isProcess = false;
		if (number != 0) {
			if (number % 3 == 0) {
				System.out.println("3�� ����̴�");
				isProcess = true;
			}
			if (number % 5 == 0) {
				System.out.println("5�� ����̴�");
				isProcess = true;
			}
			if (number % 8 == 0) {
				System.out.println("8�� ����̴�");
				isProcess = true;
			}
		}

		if (!isProcess) {
			System.out.println("��� ����� �ƴϴ�");
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
