package com.cg.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;
import com.cg.exception.EmpException;
import com.cg.util.Messages;

@Repository("eDao")
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDAO {

	//private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private javax.sql.DataSource myDataSource;
	
	@PostConstruct
	private void initialize(){
		
		setDataSource(myDataSource);
	}
	
	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	@Override
	public boolean insert(Employee emp) throws EmpException {
		// TODO Auto-generated method stub
		boolean success = false;
		int rows = 0;
		String query = "Insert into employee(id,name,mobile,salary) values(emp_seq.NEXTVAL,?,?,?)";
		try{
			rows = getJdbcTemplate().update(query, new Object[] { emp.getName(), emp.getMobile(),emp.getSalary()});
		}  catch (DataAccessException e) {
			throw new EmpException(Messages.DATA_NOT_INSERTED);
		}
		if (rows > 0)
			success = true;
		return success;
	}

	@Override
	public Employee getEmployee(int eid) throws EmpException {
		Employee emp = null;
		String query = "select * from employee where id = ?";
		try {
			emp = getJdbcTemplate().queryForObject(query, new EmpRowMapper(), eid);
		} catch (DataAccessException e) {
			throw new EmpException(Messages.EMPLOYEE_DOES_NOT_EXIST);
		}
		return emp;
	}

	@Override
	public List<Employee> getEmpList() throws EmpException {
		List<Employee> empList = null;
		String query = "select * from employee";
		try {
			empList = getJdbcTemplate().query(query, new EmpRowMapper());
		} catch (DataAccessException e) {
			throw new EmpException(Messages.DATABASE_EMPTY);
		}
		return empList;
	}

	@Override
	public int deleteEmployee(int eid) throws EmpException {

		String query = "delete * from employee where id = ?";
		int status = 0;
		try {
			status = getJdbcTemplate().update(query, new Object[] { eid });
		} catch (DataAccessException e) {
			throw new EmpException(Messages.DATA_NOT_DELETED);
		}
		return status;
	}

	@Override
	public boolean updateEmployee(Employee emp1) throws EmpException {
		boolean succes = false;
		int rows = 0;
		String query = "Update employee set name = ?, mobile = ?, salary = ? where id = ?";
		try{
			rows = getJdbcTemplate().update(query, new Object[] { emp1.getName(), emp1.getMobile(),emp1.getSalary(), emp1.getId()});
		}  catch (DataAccessException e) {
			throw new EmpException(Messages.DATA_NOT_INSERTED);
		}
		if (rows > 0)
			succes = true;
		return succes;
	}

}
