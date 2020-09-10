/**
 * 
 */
package com.rest.exception.custom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author siva
 *
 */
//@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotfoundException  extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotfoundException() {
		super();
	}
	
	public EmployeeNotfoundException(String msg) {
		super(msg);
	}

}
