package io.github.woukies.q9_1;

public class Professor {
	private String name;
	private String subject;
	private int age;

	public void getProfessorInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("����: " + getAge());
		System.out.println("����: " + getSubject());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
