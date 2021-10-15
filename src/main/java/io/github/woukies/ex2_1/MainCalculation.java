package io.github.woukies.ex2_1;

public class MainCalculation {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		calc.setFirstNum(10);
		calc.setSecondNum(2);

		calc.add();
		calc.sub();
		calc.mult();
		calc.div();
	}
}