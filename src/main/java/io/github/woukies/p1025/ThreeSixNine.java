package io.github.woukies.p1025;

public class ThreeSixNine {
	private int number;

	public void process() {
		StringBuffer result = new StringBuffer();
		boolean isClap = false;
		result.append("�ڼ�");

		for (int i = number; i > 0; i /= 10) {
			switch (number % 10) {
			case 3:
			case 6:
			case 9:
				result.append("¦");
				isClap = true;
			}
		}

		if (!isClap) {
			result.append(" ����");
		}

		System.out.println(result);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
