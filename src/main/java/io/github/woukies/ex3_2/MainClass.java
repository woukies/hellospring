package io.github.woukies.ex3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		MyCalculator myCalculator2 = ctx.getBean("myCalculator3", MyCalculator.class);
		
		myCalculator2.add();
		myCalculator2.sub();
		myCalculator2.multi();
		myCalculator2.div();
	}
}
