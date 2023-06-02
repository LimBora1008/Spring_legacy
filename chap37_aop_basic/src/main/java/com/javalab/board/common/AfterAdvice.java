package com.javalab.board.common;

/*
 * [어드바이스]
 * 	- 서비스 Layer의 메소드 실행 후에 작용하는 로직을 갖고 있는 클래스
 */
public class AfterAdvice {
	
	public AfterAdvice() {
		
	}
	
	public void FinallyLog() {
		System.out.println("[로그기록] AfterAdvice 핵심 메소드 실행후 동작합니다.");
	}
}
