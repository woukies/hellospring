package io.github.woukies.ex8_2_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:/ex8_2_1/applicationCTX.xml");
		AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("adminID: " + adminConnection.getAdminId());
		System.out.println("adminPW: " + adminConnection.getAdminPw());
		System.out.println("sub_adminID: " + adminConnection.getSub_adminId());
		System.out.println("sub_adminPW: " + adminConnection.getSub_adminPw());

		ctx.close();
	}
}
