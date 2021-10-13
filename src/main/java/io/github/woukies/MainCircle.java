package io.github.woukies;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainCircle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:circleCTX.xml");
		MyCircle2 myCircle = ctx.getBean("myCircle", MyCircle2.class);
		
		myCircle.ar();
	}
}
