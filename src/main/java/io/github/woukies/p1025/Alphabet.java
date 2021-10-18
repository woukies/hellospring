package io.github.woukies.p1025;

public class Alphabet {
	private char character;

	public void process() {
		StringBuffer result = new StringBuffer();
		for (char i = 'a'; i <= character; i++) {
			result.append(i);
		}

		System.out.println(result);
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
}
