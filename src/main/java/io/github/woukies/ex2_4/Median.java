package io.github.woukies.ex2_4;

public class Median {
	private int num1, num2, num3;

	public void process() {
		int median;
		if (num1 < num2) {
			if (num2 < num3) {
				median = num2;
			} else if (num1 < num3) {
				median = num3;
			} else {
				median = num1;
			}
		} else {
			if (num1 < num3) {
				median = num1;
			} else if (num2 < num3) {
				median = num3;
			} else {
				median = num2;
			}
		}

		System.out.println("입력된 정수가 " + num1 + "와 " + num2 + "와 " + num3 + "의 중간값은 " + median);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
}