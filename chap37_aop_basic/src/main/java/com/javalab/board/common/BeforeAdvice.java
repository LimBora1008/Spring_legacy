package com.javalab.board.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {

	public BeforeAdvice() {
		System.out.println("BeforeAdvice 어드바이스 객체 생성됨");
	}

	public void BeforeLog() {
		System.out.println("[BeforeAdvice] 핵심 메소드 실행전에 로그를 남깁니다.");
	}

}
