package io.github.woukies.q3_6;

public class DivAndRemains {
	public void process(int number) {
		System.out
				.println("입력된 수: " + number + "는 10의 자리와 1의 자리가 " + ((number / 10 == number % 10) ? "같습니다." : "다릅니다."));
	}
}
