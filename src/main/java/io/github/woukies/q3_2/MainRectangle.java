package io.github.woukies.q3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainRectangle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:rectangleCTX.xml");
		MyRectangle myRectangle = ctx.getBean("myRectangle", MyRectangle.class);

		myRectangle.ar();
	}
}
