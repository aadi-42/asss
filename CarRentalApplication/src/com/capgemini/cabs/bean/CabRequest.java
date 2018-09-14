package com.capgemini.cabs.bean;

public class CabRequest {

	private int requestId;
	private String customerName;
	private String phonenumber;
	private String dateOfRequest;
	private String requestStatus;
	private String cabNumber;
	private String addressOfPickup;
	private String pincode;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDateOfRequest() {
		return dateOfRequest;
	}

	public void setDateOfRequest(String dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getCabNumber() {
		return cabNumber;
	}

	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}

	public String getAddressOfPickup() {
		return addressOfPickup;
	}

	public void setAddressOfPickup(String addressOfPickup) {
		this.addressOfPickup = addressOfPickup;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CabRequest [requestId=" + requestId + ", customerName="
				+ customerName + ", phonenumber=" + phonenumber
				+ ", dateOfRequest=" + dateOfRequest + ", requestStatus="
				+ requestStatus + ", cabNumber=" + cabNumber
				+ ", addressOfPickup=" + addressOfPickup + ", pincode="
				+ pincode + "]";
	}

}
