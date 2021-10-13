package io.github.woukies;

public class MainCalculator {
	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNumber(10);
		myCalculator.setSecondNumber(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
	}
}
