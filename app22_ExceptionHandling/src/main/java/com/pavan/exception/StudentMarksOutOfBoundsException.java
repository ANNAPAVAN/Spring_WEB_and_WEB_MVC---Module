package com.pavan.exception;

public class StudentMarksOutOfBoundsException extends RuntimeException {
	private String exception_Message; 

	public StudentMarksOutOfBoundsException(String exception_Message) {
		this.exception_Message = exception_Message;
	}

	public String getException_Message() {
		return exception_Message;
	}

	public void setException_Message(String exception_Message) {
		this.exception_Message = exception_Message;
	}
	
	
	
}
