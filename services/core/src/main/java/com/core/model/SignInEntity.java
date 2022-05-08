package com.core.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class SignInEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String username;
	private String surname;
	private String hach;
}
