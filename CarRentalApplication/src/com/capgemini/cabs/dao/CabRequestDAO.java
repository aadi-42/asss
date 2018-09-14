package com.capgemini.cabs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exception.CabRequestException;
import com.capgemini.cabs.dao.DBUtil;
import com.capgemini.cabs.dao.QueryMapper;

public class CabRequestDAO implements ICabRequestDAO {

	@Override
	public int addCabRequestDetails(CabRequest cabRequest)
			throws CabRequestException {
		Connection conn = DBUtil.getConnection();

		try {
			PreparedStatement pstat = conn
					.prepareStatement(QueryMapper.INSERT_QUERY);
			pstat.setString(1, cabRequest.getCustomerName());
			pstat.setString(2, cabRequest.getPhonenumber());
			pstat.setString(3, cabRequest.getRequestStatus());
			pstat.setString(4, cabRequest.getCabNumber());
			pstat.setString(5, cabRequest.getAddressOfPickup());
			pstat.setString(6, cabRequest.getPincode());

			int n = pstat.executeUpdate();
			pstat.close();
			PreparedStatement pstatgetid = conn
					.prepareStatement(QueryMapper.ENQUIRYID_QUERY);
			ResultSet res = pstatgetid.executeQuery();
			while (res.next()) {
				cabRequest.setRequestId(res.getInt(1));
			}
			pstatgetid.close();
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public CabRequest getCabRequestDetails(int requestId)
			throws CabRequestException {
		Connection conn = DBUtil.getConnection();

		CabRequest requestBean = new CabRequest();

		try {
			PreparedStatement pstat = conn
					.prepareStatement(QueryMapper.SELECT_QUERY);
			pstat.setInt(1, requestId);
			ResultSet myRes = pstat.executeQuery();
			while (myRes.next()) {
				requestBean.setRequestId(myRes.getInt(1));
				requestBean.setCustomerName(myRes.getString(2));
				requestBean.setPhonenumber(myRes.getString(3));
				requestBean.setDateOfRequest(String.valueOf(myRes.getDate(4)));
				requestBean.setRequestStatus(myRes.getString(5));
				requestBean.setCabNumber(myRes.getString(6));
				requestBean.setAddressOfPickup(myRes.getString(7));
				requestBean.setPincode(myRes.getString(8));

				return requestBean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
