package com.javalab.board.common;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 어라운드 어드바이스
 * 	- 타겟 메소드 실행전 실행후 모두 동작하는 어드바이스 클래스
 * 	- ProceedingJoinPoint 객체를 메소드의 매개변수로 받아서
 * 		타겟 메소드를 알아낼 수 있으며 관련된 정보도 알아낼 수 있다
 * 		이게 없으면 타겟 메소드를 호출할 수 없다
 */
public class AroundAdvice {
	
	public AroundAdvice() {
		
	}
	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("   [로그기록] AroundAdvice - Before : 타겟 메소드 실행전에 동작합니다.");
		
		// 인자로 주어인 ProceedingJoinPoint 통해서 핵심 비즈니스 메소드 호출 가능
		// 다음 코드를 실행하지 않으면 타겟 메소드 호출불가
		Object returnObj = pjp.proceed(); // pjp.proceed(); : 타겟메소드 호출
		
		System.out.println("   [로그기록] AroundAdvice - After : 타겟 메소드 실행후에 동작합니다.");
		
		return returnObj;
	}
}
