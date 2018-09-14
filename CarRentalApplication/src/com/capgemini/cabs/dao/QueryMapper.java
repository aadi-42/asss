package com.capgemini.cabs.dao;

public interface QueryMapper {
	public static final String INSERT_QUERY = "insert into cab_request values(seq_request_id.nextval,?,?,SYSDATE,?,?,?,?)";
	public static final String SELECT_QUERY = "select * from cab_request where request_id = ?";
	public static final String ENQUIRYID_QUERY="select seq_request_id.CURRVAL from DUAL";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String UNAME = "system";
	public static final String PASSWORD = "orcl11g";

}
