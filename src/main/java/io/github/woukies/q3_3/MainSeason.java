package io.github.woukies.q3_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSeason {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:seasonCTX.xml");
		MySeason mySeason = ctx.getBean("mySeason", MySeason.class);
		
		mySeason.result();
	}
}
