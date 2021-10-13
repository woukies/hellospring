package io.github.woukies;

public class RectangleXY {
	private int x, y;

	public void process() {
		System.out.println(
				"(" + x + ", " + y + ")는 사각형 " + (100 <= x && x <= 200 && 100 <= y && y <= 200 ? "안" : "밖") + "에 있습니다.");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
