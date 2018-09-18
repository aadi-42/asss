package com.cg.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDAO;
import com.cg.exception.EmpException;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO eDao;

	@Override
	public boolean insert(Employee emp) throws EmpException {
		return eDao.insert(emp);

	}

	public EmployeeDAO geteDao() {
		return eDao;
	}

	public void seteDao(EmployeeDAO eDao) {
		this.eDao = eDao;
	}

	@Override
	public Employee getEmployee(int eid) throws EmpException {
		// TODO Auto-generated method stub
		return eDao.getEmployee(eid);
	}

	@Override
	public List<Employee> getEmpList() throws EmpException {
		// TODO Auto-generated method stub
		return eDao.getEmpList();
	}

	@Override
	public int deleteEmployee(int eid) throws EmpException {
		// TODO Auto-generated method stub
		return eDao.deleteEmployee(eid);
	}

	@Override
	public boolean updateEmployee(Employee emp2) throws EmpException {
		// TODO Auto-generated method stub
		return eDao.updateEmployee(emp2);
	}
	
}
