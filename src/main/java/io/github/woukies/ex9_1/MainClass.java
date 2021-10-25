package io.github.woukies.ex9_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:/ex9_1/applicationCTX.xml");

		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();

		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();

		ctx.close();
	}
}
