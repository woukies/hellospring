package io.github.woukies.p1207;

public class EvenNumber {
	public void process(int number) {
		int sumEven = 0;
		for (int i = 0; i <= number; i += 2) {
			sumEven += i;
		}
		System.out.println(number + "������ ¦������ �հ�� " + sumEven);
	}
}
