package io.github.woukies.ex3_2;

public class Calculator {
	public void addition(int f, int s) {
		System.out.println("addition()");
		System.out.println(f + " + " + s + " = " + (f + s));
	}

	public void subtraction(int f, int s) {
		System.out.println("subtraction()");
		System.out.println(f + " - " + s + " = " + (f - s));
	}

	public void multiplication(int f, int s) {
		System.out.println("multiplication()");
		System.out.println(f + " * " + s + " = " + (f * s));
	}

	public void division(int f, int s) {
		System.out.println("division()");
		System.out.println(f + " / " + s + " = " + (f / s));
	}
}
