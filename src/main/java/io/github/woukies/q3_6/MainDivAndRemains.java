package io.github.woukies.q3_6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDivAndRemains {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:divAndRemainsCTX.xml");
		MyDivAndRemains myDivAndRemains = ctx.getBean("myDivAndRemains", MyDivAndRemains.class);
		
		myDivAndRemains.pc();
	}
}
