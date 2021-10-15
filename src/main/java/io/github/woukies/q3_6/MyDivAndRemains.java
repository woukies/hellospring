package io.github.woukies.q3_6;

public class MyDivAndRemains {
	private DivAndRemains divAndRemains;
	private int number;

	public void pc() {
		divAndRemains.process(number);
	}

	public DivAndRemains getDivAndRemains() {
		return divAndRemains;
	}

	public void setDivAndRemains(DivAndRemains divAndRemains) {
		this.divAndRemains = divAndRemains;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
