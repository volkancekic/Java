package com.v.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GeneralExcepitonHandler {
	
	//daha genel hata yakalama
		@ExceptionHandler
		public ResponseEntity<GeneralErrorResponse> GenelhataYakala(Exception exc){
			GeneralErrorResponse hata=new GeneralErrorResponse();
			hata.setStatus(HttpStatus.BAD_REQUEST.value());
			hata.setMessage(exc.getMessage());
			return new ResponseEntity<>(hata,HttpStatus.BAD_REQUEST);
		}
}
