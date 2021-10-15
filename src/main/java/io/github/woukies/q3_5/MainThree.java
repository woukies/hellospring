package io.github.woukies.q3_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainThree {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:threeCTX.xml");
		MyThree myThree = ctx.getBean("myThree", MyThree.class);
		
		myThree.pc();
	}
}
