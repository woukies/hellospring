package io.github.woukies.q3_7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainRectangle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:rectangle2CTX.xml");
		MyRectangle myRectangle = ctx.getBean("myRectangle", MyRectangle.class);

		myRectangle.pc();
	}
}
