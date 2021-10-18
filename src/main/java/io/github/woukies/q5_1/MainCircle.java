package io.github.woukies.q5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCircle {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:q5_1/circleCTX.xml");
		CircleInfo circleInfo = ctx.getBean("circleInfo", CircleInfo.class);
		circleInfo.getCircleInfo();

		Circle circle2 = ctx.getBean("circle2", Circle.class);
		circleInfo.setCircle(circle2);
		circleInfo.getCircleInfo();

		ctx.close();
	}
}
