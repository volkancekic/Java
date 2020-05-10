package com.v.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.v.Aopdemo.Entity.Student;

@Aspect
@Component
public class AfterReturningAspect {
	@Pointcut("execution(* getAdSoyad())")
	private void getAdSoyadPointCut() {
		
	}	
	
	@AfterReturning(pointcut="getAdSoyadPointCut()", returning="result")
	public void beforeGetAdSoyad(JoinPoint jp,String result) {
		System.out.println("getAdSoyad Çalýþtý.");
		System.out.println(jp.getSignature());
		System.out.println("sonuç:"+result);		
	}
	
	//return eilen deðere müdahale edip sonucu deðiþtiriyoruz
	@Pointcut("execution(* getKanka())")
	private void getKankaPointCut() {
		
	}
	@AfterReturning(pointcut="getKankaPointCut()", returning="kanka")
	public void beforeGetAdSoyad(JoinPoint jp,Student kanka) {
		kanka.setIsim("Hasan");		
	}
	
}
