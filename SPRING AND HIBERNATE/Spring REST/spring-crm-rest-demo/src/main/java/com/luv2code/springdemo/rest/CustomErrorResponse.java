package com.luv2code.springdemo.rest;

public class CustomErrorResponse {

	private int status;
	private String mssage;
	private long timestamp;
	public CustomErrorResponse(int status, String mssage, long timestamp) {
		this.status = status;
		this.mssage = mssage;
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMssage() {
		return mssage;
	}
	public void setMssage(String mssage) {
		this.mssage = mssage;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
