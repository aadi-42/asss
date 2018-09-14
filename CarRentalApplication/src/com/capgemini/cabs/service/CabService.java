package com.capgemini.cabs.service;

import java.util.ArrayList;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.dao.CabRequestDAO;
import com.capgemini.cabs.exception.CabRequestException;

public class CabService implements ICabService {

	CabRequestDAO dao = new CabRequestDAO();

	@Override
	public int addCabRequestDetails(CabRequest cabRequest)
			throws CabRequestException {
		return dao.addCabRequestDetails(cabRequest);
	}

	// ------------------------ 1. CarRentalApplication--------------------------
	/*******************************************************************************************************
	 * Function Name : isValidEnquiry(CabRequest request) 
	 * Input Parameters : CabRequest request
	 * Return Type : Boolean
	 * Throws : CabRequestException
	 * Author : Aditya S. Prakash 
	 * Creation Date : 29/08/2018 
	 * Description : Validates the Cab Request
	 ********************************************************************************************************/

	@Override
	public boolean isValidEnquiry(CabRequest request)
			throws CabRequestException {

		ArrayList<String> validationErrors = new ArrayList<String>();

		if (!isValidCustomerName(request.getCustomerName())) {
			validationErrors
					.add("Name Incorrectly Entered. Please enter atleast 3 Characters.");
		}
		if (!isValidPhoneNumber(request.getPhonenumber())) {
			validationErrors.add("Phone Number Incorrectly Entered");
		}
		if (!isValidAddress(request.getAddressOfPickup())) {
			validationErrors.add("Address Incorrectly Entered.");
		}
		if (!isValidPincode(request.getPincode())) {
			validationErrors.add("Preferred Pincode incorrectly Entered.");
		}

		if (!validationErrors.isEmpty()) {
			throw new CabRequestException(validationErrors + " ");
		}

		return true;
	}

	// ------------------------ 1. CarRentalApplication --------------------------
	/*******************************************************************************************************
	 *  Function Name : isValidPincode(String pincode) 
	 *  Input Parameters : String pincode 
	 *  Return Type : Boolean 
	 *  Throws : 
	 *  Author : Aditya S. Prakash 
	 *  Creation Date : 29/08/2018 
	 *  Description : Validates Pincode
	 ********************************************************************************************************/

	private boolean isValidPincode(String pincode) {
		String pattern = "[0-9]{6}";

		if (pincode.matches(pattern)) {
			return true;
		}
		return false;
	}

	// ------------------------ 1. CarRentalApplication--------------------------
	/*******************************************************************************************************
	 * Function Name : isValidAddress(String address) 
	 * Input Parameters : String address 
	 * Return Type : Boolean 
	 * Throws : 
	 * Author : Aditya S. Prakash 
	 * Creation Date : 29/08/2018 
	 * Description : Validates Address
	 ********************************************************************************************************/

	private boolean isValidAddress(String address) {
		String pattern = "[A-Za-z^,]{6,}";
		if (address.matches(pattern)) {
			return true;
		}
		return false;
	}

	// ------------------------ 1. CarRentalApplication --------------------------
	/*******************************************************************************************************
	 * Function Name : isValidPhoneNumber(String contactNo) 
	 * Input Parameters : String contactNo 
	 * Return Type : Boolean 
	 * Throws : 
	 * Author : Aditya S. Prakash 
	 * Creation Date : 29/08/2018 
	 * Description : Validates Phone Number
	 ********************************************************************************************************/
	private boolean isValidPhoneNumber(String contactNo) {
		String pattern = "[789][0-9]{9}";
		if (contactNo.matches(pattern)) {
			return true;
		}
		return false;
	}

	// ------------------------ 1. CarRentalApplication--------------------------
	/*******************************************************************************************************
	 * Function Name : isValidCustomerName(String cName) 
	 * Input Parameters : String cName 
	 * Return Type : Boolean 
	 * Throws : 
	 * Author : Aditya S. Prakash 
	 * Creation Date : 29/08/2018 
	 * Description : Validates Customer Name
	 ********************************************************************************************************/

	private boolean isValidCustomerName(String cName) {
		String pattern = "[A-Za-z]{3,}";
		if (cName.matches(pattern)) {
			return true;
		}
		return false;
	}

	// ------------------------ 1. CarRentalApplication--------------------------
	/*******************************************************************************************************
	 * Function Name : pincode(String pincode) 
	 * Input Parameters : String pincode 
	 * Return Type : String 
	 * Throws : 
	 * Author : Aditya S. Prakash 
	 * Creation Date : 29/08/2018 
	 * Description : Allocates cabNumber on the basis of pincode.
	 ********************************************************************************************************/

	public String pincode(String pincode) {

		if (pincode.equals("400096")) {
			String cabNumber = "MH VS 2345";
			return cabNumber;

		} else if (pincode.equals("411026")) {
			String cabNumber = "MH VH 34567";
			return cabNumber;
		}

		else if (pincode.equals("411013")) {
			String cabNumber = "MH AN 97886";
			return cabNumber;
		}

		else if (pincode.equals("560066")) {
			String cabNumber = "MH AS 875";
			return cabNumber;
		}

		else if (pincode.equals("382009")) {
			String cabNumber = "MH KN 9856";
			return cabNumber;
		}

		else if (pincode.equals("400708")) {
			String cabNumber = "MH TF 8956";
			return cabNumber;
		}

		return null;

	}

}
