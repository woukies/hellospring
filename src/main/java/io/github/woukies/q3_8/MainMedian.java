package io.github.woukies.q3_8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMedian {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:medianCTX.xml");
		MyMedian myMedian = ctx.getBean("myMedian", MyMedian.class);

		myMedian.pc();
	}
}
