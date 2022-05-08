package com.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.model.SignInReq;
import com.core.model.SignInResp;
import com.core.service.SignInService;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})

public class Controller {

	@Autowired
	SignInService signInService;
	@PostMapping("/SignIn")
	public ResponseEntity<SignInResp> SignIn (
			@RequestBody SignInReq signInReq){
		
		return new ResponseEntity<SignInResp>(signInService.CheckLogin(signInReq),HttpStatus.OK);
	}
}
