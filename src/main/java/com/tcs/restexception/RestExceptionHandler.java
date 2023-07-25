package com.tcs.restexception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.exception.ApiError;
import com.tcs.exception.NoProductFoundException;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	@ExceptionHandler(value=NoProductFoundException.class)
	public ResponseEntity<ApiError> noProdResponseEntity() {
		ApiError error=new ApiError(400,"NoProduct is Found",new Date());

		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	}

}
