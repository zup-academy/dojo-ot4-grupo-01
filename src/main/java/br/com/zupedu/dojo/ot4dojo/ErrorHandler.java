package br.com.zupedu.dojo.ot4dojo;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorHandler {
	
	@ExceptionHandler
    public void validationError(MethodArgumentNotValidException exception){
		
		ApiError apiError = new ApiError();
		
		exception.getFieldErrors().forEach(field -> apiError.add(field.getField(), 
				field.getDefaultMessage()));
		
	}
	class ApiError{

		void add(String field, String defaultMessage) {
			
			
			
			return null;
		}
		
	}
}
