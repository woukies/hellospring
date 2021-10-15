package io.github.woukies.q3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainCircle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:circleCTX.xml");
		MyCircle myCircle = ctx.getBean("myCircle", MyCircle.class);
		
		myCircle.ar();
	}
}
