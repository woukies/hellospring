package io.github.woukies.q6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSinger {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:q6_3/singerCTX.xml",
				"classpath:q6_3/singerCTX2.xml");

		Singer singer1 = ctx.getBean("singer1", Singer.class);
		System.out.println(singer1.getName());
		System.out.println(singer1.getMember());
		System.out.println(singer1.getSong());

		System.out.println("-------------------------");

		SingerInfo singerInfo = ctx.getBean("singerInfo1", SingerInfo.class);
		Singer singer2 = singerInfo.getSinger();
		System.out.println(singer2.getName());
		System.out.println(singer2.getMember());
		System.out.println(singer2.getSong());

		System.out.println("-------------------------");

		Singer singer3 = ctx.getBean("singer3", Singer.class);
		System.out.println(singer3.getName());
		System.out.println(singer3.getMember());
		System.out.println(singer3.getSong());
		
		ctx.close();
	}
}
