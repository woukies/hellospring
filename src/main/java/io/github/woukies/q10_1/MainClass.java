package io.github.woukies.q10_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:/q10_1/applicationCTX.xml");
		
		Car car = ctx.getBean("car", Car.class);
		car.getCarInfo();
		
		Graphic graphic = ctx.getBean("graphic", Graphic.class);
		graphic.getGraphicInfo();
		
		ctx.close();
	}
}
