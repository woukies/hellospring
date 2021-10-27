package io.github.woukies.q10_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("within(io.github.woukies.q10_1.*)")
	public void pointcutMethod() {
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("@@@### start ===> " + jointPoint.getSignature().toShortString());
		
		try {
			return jointPoint.proceed();
		} finally {
			System.out.println("@@@### end ===> " + jointPoint.getSignature().toShortString());
		}
	}
}
