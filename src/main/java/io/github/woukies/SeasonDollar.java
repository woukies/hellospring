package io.github.woukies;

public class SeasonDollar {
	public static void main(String[] args) {
		Season season = new Season();
		season.setMonth(9);
		season.getSeason();
		
		Won2dollar won2dollar = new Won2dollar();
		won2dollar.setKrw(3300);
		won2dollar.calcDollar();
	}
}
