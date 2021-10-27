package io.github.woukies.ex10_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("within(io.github.woukies.ex10_1.*)")
	private void pointcutMethod() {
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		// joinPoint: ���� ��� ���� ���
		// �ٽɱ�� Ŭ������ �޼ҵ� ������ ������ ��
		String signatureStr = joinPoint.getSignature().toShortString();
		// ������(advice) - �ٽɱ���� start.
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();

		Object obj = null;
		try {
			// �ٽɱ�� ����
			obj = joinPoint.proceed();
		} finally {
			// ������ ����(advice) - �ٽɱ���� finished.
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " ��� �ð�: " + (et - st));
		}

		return obj;
	}
}
