package io.github.woukies.q3_5;

public class Three {
	public void process(int number) {
		System.out.println("입력된 수: " + number + "는 3의 배수" + (number % 3 == 0 ? "입니다" : "가 아닙니다"));
	}
}
