package io.github.woukies.ex4_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:myInfoCTX.xml");
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		ctx.close();
	}
}
