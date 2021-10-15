package io.github.woukies.q3_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainWon2Dollar {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:won2DollarCTX.xml");
		MyWon2Dollar myWon2Dollar = ctx.getBean("myWon2Dollar", MyWon2Dollar.class);
		
		myWon2Dollar.exch();
	}
}
