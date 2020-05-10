package com.v.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetAspect {
	@Pointcut("execution(* get*(..))")
	private void getMthd() {
		
	}
	@Pointcut("execution(* *sim(..))")
	private void simMthd() {
		
	}
	
	@Before("getMthd()")//tüm get metotlarý anlamýnda
	public void beforeGetStudentFields() {
		System.out.println("Before get student advice called.");
	}
	@Before("simMthd()")
	public void endSimMthd() {
		System.out.println("end sim advice called.");
	}
	/*@Before("getMthd()")
	public void logToFile() {
		System.out.println("log to file advice called.");
	}*/
}
