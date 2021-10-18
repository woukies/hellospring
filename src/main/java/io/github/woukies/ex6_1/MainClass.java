package io.github.woukies.ex6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ex6_1/applicationCTX.xml",
				"classpath:ex6_1/applicationCTX1.xml");

		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());

		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());

		if (student1.equals(student2)) {
			System.out.println("student1 == student2");
		}

		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getHobbys());

		if (student1.equals(student3)) {
			System.out.println("student1 == student3");
		} else {
			System.out.println("student1 != student3");
		}

		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamaName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());

		ctx.close();
	}
}
