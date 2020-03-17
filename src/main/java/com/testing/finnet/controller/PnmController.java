package com.testing.finnet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testing.finnet.model.request.FinancialPnmRequest;
import com.testing.finnet.model.request.InquiryPnmRequest;
import com.testing.finnet.service.PnmServices;;

@RestController
@RequestMapping(value ="/pnm")
public class PnmController {
	
	@Autowired 
	private PnmServices pnmService;
	
	@RequestMapping(value = "/inquiry", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> inquiry(@Valid @RequestBody InquiryPnmRequest request, BindingResult result) {
		
		if (result.hasErrors()) {
			String response = result.getFieldError().getDefaultMessage();
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}
		
		Object response = pnmService.inquiryPnm(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@RequestMapping(value = "/financial", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> financial (@Valid @RequestBody FinancialPnmRequest requestfinancial, BindingResult result){
		if (result.hasErrors()) {
			String response = result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage();
			return new ResponseEntity<> (response, HttpStatus.BAD_REQUEST);
		}
		Object response = pnmService.financialrespon(requestfinancial);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
			
	}

}
