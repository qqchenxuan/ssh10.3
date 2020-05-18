package com.xtgj.j2ee.chapter10.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogPrint {
	// 定义前置通知
	public void doAccessCheck(JoinPoint jp) {

		Object[] objects=jp.getArgs();
		for(Object obj :objects){
			System.out.print("doAccessCheck");
			System.out.print(obj.toString());
		}
		System.out.println("");

	}

	// 定义后置通知
	public void doReturnCheck(JoinPoint jp) {
		System.out.println("doReturnCheck");
	}

	// 定义例外通知
	public void doExceptionAction(JoinPoint jp) {
		System.out.println("doExceptionAction");
	}

	// 定义最终通知
	public void doReleaseAction() {
		System.out.println("doReleaseAction");
	}

	// 环绕通知
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("doReleaseAction");
		return pjp.proceed();
	}
}
