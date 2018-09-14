package com.capgemini.cabs.service;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exception.CabRequestException;

public interface ICabService {
	
	int addCabRequestDetails(CabRequest cabRequest) throws CabRequestException;

	boolean isValidEnquiry(CabRequest request) throws CabRequestException;

}
