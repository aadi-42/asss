package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cg.bean.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int row) throws SQLException {

		return new Employee(resultSet.getInt(1), resultSet.getString(2),
				resultSet.getLong(3), resultSet.getDouble(4));

	}

}
