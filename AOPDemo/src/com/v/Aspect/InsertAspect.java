package com.v.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InsertAspect {
	@Before("execution(* addStudent(*))")
	public void beforeInsertStudentAdvice() {
		System.out.println("Before insert student advice called.");
	}
}
