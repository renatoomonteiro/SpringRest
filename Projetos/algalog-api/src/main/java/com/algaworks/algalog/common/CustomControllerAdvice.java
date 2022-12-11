package com.algaworks.algalog.common;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice 
public class CustomControllerAdvice {
	   @InitBinder
	    private void activateDirectFieldAccess(DataBinder dataBinder) {
	        dataBinder.initDirectFieldAccess();
	    }
}
