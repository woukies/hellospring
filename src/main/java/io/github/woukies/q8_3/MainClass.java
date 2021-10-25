package io.github.woukies.q8_3;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String config = scanner.next();
		scanner.close();
		
		if(!(config.equals("oracle") || config.equals("mysql"))) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("classpath:/q8_3/oracleCTX.xml", "classpath:/q8_3/mysqlCTX.xml");
		DbInfo dbInfo = ctx.getBean("dbInfo", DbInfo.class);
		System.out.println(config);
		System.out.println("driver: " + dbInfo.getDriver());
		System.out.println("url: " + dbInfo.getUrl());
		System.out.println("user: " + dbInfo.getUser());
		System.out.println("pwd: " + dbInfo.getPassword());
		
		ctx.close();
	}
}
