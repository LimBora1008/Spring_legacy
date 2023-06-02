package com.javalab.mybatis.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employees {
	private Integer employeeId;
	private String lastName;
	private String firstName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private Integer salary;
	private Integer commissionPct;
	private Integer managerId;
	private Integer departmentId;

}
