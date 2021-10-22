package io.github.woukies.q8_1;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:/q8_1/oracle.account"));
			System.out.println(env.getProperty("emp.id"));
			System.out.println(env.getProperty("emp.pw"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("classpath:/q8_1/applicationCTX.xml");
		gCtx.refresh();
		EmpConnection empConnection = gCtx.getBean("empConnection", EmpConnection.class);
		
		System.out.println("emp ID: " + empConnection.getEmpId());
		System.out.println("emp PW: " + empConnection.getEmpPw());

		gCtx.close();
		ctx.close();
	}
}
