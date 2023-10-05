package com.elasticSearch.crud.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Message {
	private String code;
	private String Message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Message(String code, String message) {
		super();
		this.code = code;
		Message = message;
	}
	public Message() {
		super();
	}
	
	

}
