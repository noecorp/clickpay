package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.model.UserEntity;

@Local
public interface UserBeanLocal {
	
	public void createUser(UserEntity user);
	
	
	
	public void showAllUsers();

}