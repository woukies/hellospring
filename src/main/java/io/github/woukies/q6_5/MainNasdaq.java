package io.github.woukies.q6_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainNasdaq {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:q6_5/nasdaqCTX.xml",
				"classpath:q6_5/nasdaqCTX2.xml");

		Nasdaq nasdaq1 = ctx.getBean("nasdaq1", Nasdaq.class);
		System.out.println(nasdaq1.getStock());
		System.out.println(nasdaq1.getCapRank());
		System.out.println(nasdaq1.getProduct());
		
		System.out.println("===========================");
		
		NasdaqInfo nasdaqInfo = ctx.getBean("nasdaqInfo1", NasdaqInfo.class);
		Nasdaq nasdaq2 = nasdaqInfo.getNasdaq();
		System.out.println(nasdaq2.getStock());
		System.out.println(nasdaq2.getCapRank());
		System.out.println(nasdaq2.getProduct());
		
		System.out.println("===========================");
		
		Nasdaq nasdaq3 = ctx.getBean("nasdaq3", Nasdaq.class);
		System.out.println(nasdaq3.getStock());
		System.out.println(nasdaq3.getCapRank());
		System.out.println(nasdaq3.getProduct());
		
		ctx.close();
	}
}

