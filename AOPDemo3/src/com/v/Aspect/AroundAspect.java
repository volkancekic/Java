package com.v.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
	
	@Pointcut("execution(* getIsim*(..))")
	private void getterPC() {
		
	}
	
	@Around("getterPC()")
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("---BEFORE---");
		Long begin=System.currentTimeMillis();//basladý
		Object result=pjp.proceed();
		Long end=System.currentTimeMillis();//bitti
		System.out.println("---AFTER---");
		System.out.println("Program "+(end-begin)+" ms sürdü.");
		return result;
	}
	
}
