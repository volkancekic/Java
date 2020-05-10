/*package com.v.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetAspect {
	@Pointcut("execution(* get*(..))")
	private void getMthd() {
		
	}
	@Pointcut("execution(* set*(..))")
	private void setMthd() {
		
	}
	
	@Before("getMthd()")
	public void beforeGetStudentFields() {
		System.out.println("Before get method advice called.");
	}
	@Before("setMthd()")
	public void beforeSetMthd(JoinPoint jp) {
		System.out.println("Before set method advice called.");
		MethodSignature ms=(MethodSignature) jp.getSignature();
		Object[] args=jp.getArgs();//set methodundaki parametreler
		System.out.println("Method:"+ms.getMethod());//hangi setMetodu çalisti onu verir
		System.out.println("Parametreler:");
		for(Object obj:args) {
			System.out.println("-"+obj);
		}
		
	}
	
}
*/