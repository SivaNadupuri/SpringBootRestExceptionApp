/**
 * 
 */
package com.rest.exception.model;

/**
 * @author siva
 *
 */
public class ErrorType {

	private String message;
	private String code;
	private String error;
	private String classType;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	public ErrorType(String message, String code, String error, String classType) {
		
		this.message = message;
		this.code = code;
		this.error = error;
		this.classType = classType;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	/**
	 * @return the classType
	 */
	public String getClassType() {
		return classType;
	}
	/**
	 * @param classType the classType to set
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
}
