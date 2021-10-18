package io.github.woukies.p1025;

public class AsteriskCapital {
	public static void main(String[] args) {
		Asterisk asterisk = new Asterisk();
		asterisk.setRow(5);
		asterisk.process();
		
		System.out.println();
		
		Capital capital = new Capital();
		capital.setCharacter('F');
		capital.process();
	}
}