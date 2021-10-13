package io.github.woukies;

public class Won2dollar {
	private int krw;
	
	public void calcDollar() {
		System.out.println("$" + (krw/1200.0));
	}

	public int getKrw() {
		return krw;
	}

	public void setKrw(int krw) {
		this.krw = krw;
	}
}
