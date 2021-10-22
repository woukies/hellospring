package io.github.woukies.ex7_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ex7_1/applicationCTX.xml");
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class);
		System.out.println("�̸�: " + student.getName());
		System.out.println("����: " + student.getAge());
		
		ctx.close();
	}
}

