package io.github.woukies.ex3_1;

public class MainClass {
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
