package com.javalab.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 게터 세터 to스트링 등 기능을 한번에 제공하는 어노테이션
@NoArgsConstructor // 기본생성자를 자동으로 생성
@AllArgsConstructor // 오버로딩생성자를 자동으로 생성
public class Employee {
    private String id; // 아이디
    private String Name; // 이름
    private int age; // 나이
    private String department; // 부서
}