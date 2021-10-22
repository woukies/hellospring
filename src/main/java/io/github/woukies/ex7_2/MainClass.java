package io.github.woukies.ex7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ex7_2/applicationCTX.xml");
		ctx.refresh();
		ctx.close();
	}
}
