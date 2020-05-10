package com.v.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ErrorAspect {
	/*
	@Pointcut("execution(* get*(..))")
	private void getterPC() {
		
	}
	
	@After("getterPC()")
	public void after(JoinPoint jp) {
		System.out.println("After");
	}
	
	@AfterReturning("getterPC()")
	public void afterReturning(JoinPoint jp) {
		System.out.println("After Returning:"+jp.getSignature());
	}
	
	@AfterThrowing(throwing = "exc", pointcut="getterPC()")
	public void logError(Throwable exc) {
		System.out.println("Hatasýz Kod Olmaz."+exc.getMessage());
		System.out.println(exc);
	}
	*/
}
