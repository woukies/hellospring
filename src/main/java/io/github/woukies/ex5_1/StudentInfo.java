package io.github.woukies.ex5_1;

public class StudentInfo {
	private Student student;

	public StudentInfo(Student student) {
		this.student = student;
	}

	public void getStudentInfo() {
		System.out.println("�̸�: " + student.getName());
		System.out.println("����: " + student.getAge());
		System.out.println("�г�: " + student.getGradeNum());
		System.out.println(" �� : " + student.getClassNum());
		System.out.println("----------------------------");
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
