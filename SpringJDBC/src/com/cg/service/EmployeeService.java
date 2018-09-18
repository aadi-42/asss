package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.exception.EmpException;

public interface EmployeeService {

	boolean insert(Employee emp) throws EmpException;

	Employee getEmployee(int eid) throws EmpException;

	List<Employee> getEmpList() throws EmpException;
	
	int deleteEmployee(int eid) throws EmpException;

	boolean updateEmployee(Employee emp2) throws EmpException;

}
