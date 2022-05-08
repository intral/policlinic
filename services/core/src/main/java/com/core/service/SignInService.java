package com.core.service;

import org.springframework.stereotype.Repository;

import com.core.model.SignInReq;
import com.core.model.SignInResp;

@Repository
public interface SignInService {
	SignInResp CheckLogin(SignInReq signInReq);

}
