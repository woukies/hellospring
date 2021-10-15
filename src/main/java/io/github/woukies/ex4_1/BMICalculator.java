package io.github.woukies.ex4_1;

public class BMICalculator {
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;

	public void bmiCalculator(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h * h);

		System.out.println("BMI ����: " + (int) result);

		if (result > obesity) {
			System.out.println("���Դϴ�.");
		} else if (result > overWeight) {
			System.out.println("��ü���Դϴ�.");
		} else if (result > normal) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("��ü���Դϴ�.");
		}
	}

	public double getLowWeight() {
		return lowWeight;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
}
