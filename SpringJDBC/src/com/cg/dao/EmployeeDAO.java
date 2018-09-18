package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.exception.EmpException;

public interface EmployeeDAO {

	boolean insert(Employee emp) throws EmpException;

	Employee getEmployee(int eid) throws EmpException;

	List<Employee> getEmpList() throws EmpException;

	int deleteEmployee(int eid) throws EmpException;

	boolean updateEmployee(Employee emp1) throws EmpException;
	
	

}
