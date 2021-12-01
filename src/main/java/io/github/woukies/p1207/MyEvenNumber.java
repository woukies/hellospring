package io.github.woukies.p1207;

public class MyEvenNumber {
	private int number;
	private EvenNumber evenNumber;

	public void pc() {
		evenNumber.process(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public EvenNumber getEvenNumber() {
		return evenNumber;
	}

	public void setEvenNumber(EvenNumber evenNumber) {
		this.evenNumber = evenNumber;
	}
}
