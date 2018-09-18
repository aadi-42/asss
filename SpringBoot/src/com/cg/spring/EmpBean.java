package com.cg.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class EmpBean {
	@Value("${eid}")
	private int empId;
	@Value("${ename}")
	private String empName;
	@Value("${desig}")
	private String designation;
	
	@Autowired
	private EmpService eService;
	
	@PostConstruct
	public void init(){
		System.out.println("Employee Init...");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Being Destroyed");
	}
	

	@Override
	public String toString() {
		return "EmpBean [empId=" + empId + ", empName=" + empName
				+ ", designation=" + designation + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void print() {
		// TODO Auto-generated method stub
		eService.print();
	}

}
