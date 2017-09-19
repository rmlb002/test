package com.zhiyou100.test.service;

public interface IMessageService {

	public String getInfo();
	
	public boolean delete(String mid);
	
	public boolean login(String username, String password);
}
