package io.github.woukies.p1025;

public class EvenThreeAlpha {
	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		evenNumber.setNumber(10);
		evenNumber.process();

		ThreeSixNine threeSixNine = new ThreeSixNine();
		threeSixNine.setNumber(36);
		threeSixNine.process();

		Alphabet alphabet = new Alphabet();
		alphabet.setCharacter('c');
		alphabet.process();
	}
}
