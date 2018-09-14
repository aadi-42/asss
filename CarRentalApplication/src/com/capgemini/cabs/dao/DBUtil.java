package com.capgemini.cabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.capgemini.cabs.ui.Client;



public class DBUtil {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection(QueryMapper.URL,
					QueryMapper.UNAME, QueryMapper.PASSWORD);
			
			Client.logger.info("DB CONNECTION ESTABLISHED");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
