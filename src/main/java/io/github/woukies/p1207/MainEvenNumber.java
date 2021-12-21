package io.github.woukies.p1207;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEvenNumber {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:/p1207/evenNumberCTX.xml");
		MyEvenNumber myEvenNumber = ctx.getBean(MyEvenNumber.class);
		myEvenNumber.pc();
		ctx.close();
	}
}
