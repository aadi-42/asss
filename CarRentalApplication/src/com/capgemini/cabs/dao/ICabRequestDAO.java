package com.capgemini.cabs.dao;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exception.CabRequestException;

public interface ICabRequestDAO {

	int addCabRequestDetails(CabRequest cabRequest) throws CabRequestException;

	public CabRequest getCabRequestDetails(int requestId)
			throws CabRequestException;

}
