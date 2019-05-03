package com.amitinfotech.java.restfulwebservices.helloworld;

import java.util.List;

public class WelcomeBean {
	
	private int result;
	
	private String message;
	
	private List data;
	
	public WelcomeBean(int result, String message, List data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}
	
	
}
