package io.github.woukies.ex2_5;

public class Multiple {
	private int number;

	public void process() {
		boolean isProcess = false;
		if (number != 0) {
			if (number % 3 == 0) {
				System.out.println("3의 배수이다");
				isProcess = true;
			}
			if (number % 5 == 0) {
				System.out.println("5의 배수이다");
				isProcess = true;
			}
			if (number % 8 == 0) {
				System.out.println("8의 배수이다");
				isProcess = true;
			}
		}

		if (!isProcess) {
			System.out.println("어느 배수도 아니다");
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
