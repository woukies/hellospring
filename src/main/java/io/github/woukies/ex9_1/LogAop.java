package io.github.woukies.ex9_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		// 핵심기능 클래스의 메소드 정보를 가지고 옴
		String signatureStr = joinPoint.getSignature().toShortString();
		// 공통 기능(advice) - 핵심기능이 start.
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();

		Object obj = null;
		try {
			// 핵심기능 실행
			obj = joinPoint.proceed();
		} finally {
			// 공통기능 실행(advice) - 핵심기능이 finished.
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과 시간: " + (et - st));
		}

		return obj;
	}
}
