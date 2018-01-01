package com.soda.aop;


import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloableException {

	@ExceptionHandler(BindException.class)
	@ResponseBody
	public Object handleBindException(BindException exception){
		System.out.println("=========1212121========");
		FieldError fieldError = exception.getBindingResult().getFieldError();
		String fieldName = fieldError.getField();
		String defaultMessage = fieldError.getDefaultMessage();
		return fieldName+""+defaultMessage;
	}

}
