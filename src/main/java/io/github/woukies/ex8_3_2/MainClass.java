package io.github.woukies.ex8_3_2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IP: " + serverInfo.getIpNum());
		System.out.println("Port: " + serverInfo.getPortNum());

		ctx.close();
	}
}
