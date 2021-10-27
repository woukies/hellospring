package io.github.woukies.q9_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:/q9_1/applicationCTX.xml");
		
		Professor professor = ctx.getBean("professor", Professor.class);
		professor.getProfessorInfo();
		
		Singer singer = ctx.getBean("singer", Singer.class);
		singer.getSingerInfo();
		
		ctx.close();
	}
}
