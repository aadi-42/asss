package com.capgemini.cabs.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exception.CabRequestException;
import com.capgemini.cabs.service.CabService;

public class Client {

	public static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) throws CabRequestException {
		PropertyConfigurator.configure("resources//log4j.properties");

		Scanner in = new Scanner(System.in);
		int choice = 0;

		CabService cabService = new CabService();
		do {

			System.out.println("1) Raise Cab Request");
			System.out.println("2) Exit");
			choice = in.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter the name of the customer: ");
				String customerName = in.next();
				System.out.println("Enter customer phone number: ");
				String phoneNumber = in.next();
				System.out.println("Enter Pick up address: ");
				String pickupAddress = in.next();
				System.out.println("Enter Pin Code: ");
				String pincode = in.next();

				CabRequest request = new CabRequest();
				request.setCustomerName(customerName);
				request.setPhonenumber(phoneNumber);
				request.setAddressOfPickup(pickupAddress);
				request.setPincode(pincode);

				request.setCabNumber(cabService.pincode(pincode));
				request.setRequestStatus("Not Accepted");

				try {
					cabService.isValidEnquiry(request);
				} catch (CabRequestException e) {
					logger.error("Validation unsuccessful");

					System.err.println(e.getMessage() + " Please Try Again...");
					break;
				}

				logger.info("Validation successful");

				if (cabService.pincode(pincode) == null) {
					request.setRequestStatus("Not Accepted");
				} else
					request.setRequestStatus("Accepted");

				int n = cabService.addCabRequestDetails(request);
				if (n > 0) {
					// request.setRequestStatus("Accepted");
					System.out
							.println("Your Cab Request has been successfully registered, your request ID is : "
									+ request.getRequestId());
					logger.info("Enquiry is added");
				} else {
					logger.error("Enquiry not added");
				}
				break;

			case 2:
				System.out.println("Thank You for selecting us!!");
				System.exit(0);
			default:
				break;
			}

		} while (choice != 0);
		in.close();

	}
}
