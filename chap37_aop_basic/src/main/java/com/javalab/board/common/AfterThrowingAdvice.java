package com.javalab.board.common;

import org.aspectj.lang.JoinPoint;

/*
 * [어드바이스] AfterThrowingAdvice
 * 	- 타겟 메소드 실행중 예외가 발생했을 때 수행되는 메소드를 갖고 있는 어드바이스 클래스
 */
public class AfterThrowingAdvice {
	
	public AfterThrowingAdvice() {
		
	}
	
	// 타겟 메소드 실행중 예외가 발생하면 해당 예외 객체를 exceptObj객체에 바인드 하라는 의미
	public void exceptionLog(JoinPoint jp,Exception exceptionObj) {
		System.out.println("   [예외처리] 타겟메소드(비지니스 로직 메소드) 수행 중 예외가 발생했습니다");
	}
}
