package io.github.woukies.q9_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("@@@### start ===> " + joinPoint.getSignature().toShortString());
		
		Object obj = null;

		try {
			obj = joinPoint.proceed();
		} finally {
			System.out.println("@@@### end ===> " + joinPoint.getSignature().toShortString());
		}
		
		return obj;
	}
}
