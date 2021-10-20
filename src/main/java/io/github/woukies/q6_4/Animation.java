package io.github.woukies.q6_4;

import java.util.ArrayList;

public class Animation {
	private String title;
	private int year;
	private ArrayList<String> character;

	public Animation(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<String> getCharacter() {
		return character;
	}

	public void setCharacter(ArrayList<String> character) {
		this.character = character;
	}
}
