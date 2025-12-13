package com.example.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserValidation {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> f1(MethodArgumentNotValidException me){
		Map<String, String> errors=new HashMap<String, String>();
		me.getBindingResult().getAllErrors().forEach((x)->{errors.put(((FieldError)x).getField(), x.getDefaultMessage());});
		
		return ResponseEntity.badRequest().body(errors);
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> f2(Exception e){
		return ResponseEntity.badRequest().body(e.getMessage());
	}
}
