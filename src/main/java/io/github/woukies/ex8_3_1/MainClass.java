package io.github.woukies.ex8_3_1;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("채널: ");
		String str = scanner.next();

		String config = "";
		scanner.close();
		if (str.equals("dev") || str.equals("run")) {
			config = str;
		} else {
			System.out.println("잘못된 입력");
			return;
		}

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("classpath:/ex8_3_1/applicationCTX_dev.xml", "classpath:/ex8_3_1/applicationCTX_run.xml");
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IP: " + serverInfo.getIpNum());
		System.out.println("Port: " + serverInfo.getPortNum());

		ctx.close();
	}
}
