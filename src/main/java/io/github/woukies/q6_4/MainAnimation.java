package io.github.woukies.q6_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAnimation {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:q6_4/animationCTX.xml",
				"classpath:q6_4/animationCTX2.xml");
		
		Animation animation1 = ctx.getBean("animation1", Animation.class);
		System.out.println(animation1.getTitle());
		System.out.println(animation1.getYear());
		System.out.println(animation1.getCharacter());
		
		System.out.println("----------------------------");

		AnimationInfo animationInfo = ctx.getBean("animationInfo1", AnimationInfo.class);
		Animation animation2 = animationInfo.getAnimation();
		System.out.println(animation2.getTitle());
		System.out.println(animation2.getYear());
		System.out.println(animation2.getCharacter());
		
		System.out.println("----------------------------");
		
		Animation animation3 = ctx.getBean("animation3", Animation.class);
		System.out.println(animation3.getTitle());
		System.out.println(animation3.getYear());
		System.out.println(animation3.getCharacter());
		
		ctx.close();
	}
}
