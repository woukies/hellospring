package io.github.woukies;

public class MyCalculator {
	private Calculator calculator;
	private int firstNumber;
	private int secondNumber;
	
	public void add() {
		calculator.addition(firstNumber, secondNumber);
	}
	public void sub() {
		calculator.subtraction(firstNumber, secondNumber);
	}
	public void multi() {
		calculator.multiplication(firstNumber, secondNumber);
	}
	public void div() {
		calculator.division(firstNumber, secondNumber);
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}
