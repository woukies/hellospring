package io.github.woukies.q3_8;

public class Median {
	public void process(int num1, int num2, int num3) {
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
}
