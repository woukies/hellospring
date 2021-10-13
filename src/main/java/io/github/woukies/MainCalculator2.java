package io.github.woukies;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCalculator2 {
	public static void main(String[] args) {
		// String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		MyCalculator myCalculator2 = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator2.add();
		myCalculator2.sub();
		myCalculator2.multi();
		myCalculator2.div();
	}
}
