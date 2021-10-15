package io.github.woukies.q3_7;

public class Rectangle {
	public void process(int x, int y) {
		System.out.println("(" + x + ", " + y + ")는 사각형 " + (100 <= x && x <= 200 && 100 <= y && y <= 200 ? "안" : "밖")
				+ "에 있습니다.");
	}
}
