package io.github.woukies.ex9_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		// �ٽɱ�� Ŭ������ �޼ҵ� ������ ������ ��
		String signatureStr = joinPoint.getSignature().toShortString();
		// ���� ���(advice) - �ٽɱ���� start.
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
