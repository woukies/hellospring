package io.github.woukies.p1025;

public class Asterisk {
	private int row;

	public void process() {
		for (int i = row; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
