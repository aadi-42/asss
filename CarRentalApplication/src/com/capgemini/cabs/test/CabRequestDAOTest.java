package com.capgemini.cabs.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.dao.CabRequestDAO;
import com.capgemini.cabs.exception.CabRequestException;

public class CabRequestDAOTest {

	public static CabRequestDAO dao = new CabRequestDAO();

	CabRequest cabRequest = new CabRequest();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAddCabRequestDetails() throws CabRequestException {

		cabRequest.setCustomerName("Aditya");
		cabRequest.setPhonenumber("8097881369");
		cabRequest.setRequestStatus("Accepted");
		cabRequest.setCabNumber("MH AS 875");
		cabRequest.setAddressOfPickup("ATP, Whitefield, Bangalore");
		cabRequest.setPincode("560066");

		assertEquals(1, dao.addCabRequestDetails(cabRequest));
	}

}
