package com.rest.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rest.exception.custom.EmployeeNotfoundException;
import com.rest.exception.model.ErrorType;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(EmployeeNotfoundException.class)
	// @ResponseBody //JSON
	public ResponseEntity<ErrorType> handleEmpNotFoundEx(EmployeeNotfoundException ex) {

		return new ResponseEntity<ErrorType>(
				new ErrorType(ex.getMessage(), "NO_EMP_FOUND", "DATA NOT FOUND FOR GIVEN ID", "Employee"),
				HttpStatus.BAD_REQUEST);
	}

}