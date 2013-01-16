package com.synccit.android;

/**
 * https://github.com/drakeapps/synccit#example-json-update-call
 */
public class SynccitResponse {
	
	private String key;
	private String value;
	
	SynccitResponse(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public boolean isSuccess() {
		return "success".equals(key);
	}
	
	public boolean isError() {
		return "error".equals(key);
	}
	
	public String getMessage() {
		return value;
	}

}
