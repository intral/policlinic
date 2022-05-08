package com.core.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.core.model.SignInEntity;
import com.core.model.SignInReq;
import com.core.model.SignInResp;

@Primary
@Service
public class SignInServiceImpl implements SignInService {
	
	private ModelMapper modelMapper;
	
	@Autowired
	SignInServiceImpl(){
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		PropertyMap<SignInReq,SignInEntity> propertyInMap = new PropertyMap<SignInReq, SignInEntity>() {
			@Override
			protected void configure() {
				map(source.getLogon()).setUsername(null);
				map(source.getPass()).setHach(null);	
			}
		};
		PropertyMap<SignInEntity, SignInResp> propertyOutMap = new PropertyMap<SignInEntity, SignInResp>(){
			@Override
			protected void configure() {
				map(source.getName()).setName(null);
				map(source.getSurname()).setSurname(null);	
				map(source.getHach()).setToken(null);	
				map(source.getName()).setName(null);
			}
		};
		modelMapper.addMappings(propertyOutMap);
		modelMapper.addMappings(propertyInMap);
	}
	
	@Override
	public SignInResp CheckLogin(SignInReq signInReq) {
		SignInEntity entity =  modelMapper.map(signInReq, SignInEntity.class);
		entity.setSurname("Джони кэш");
		entity.setName("Игорь");;
		
		return modelMapper.map(entity, SignInResp.class);
	}

}
