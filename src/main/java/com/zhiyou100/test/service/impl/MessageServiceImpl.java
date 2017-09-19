package com.zhiyou100.test.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.zhiyou100.test.service.IMessageService;
import com.zhiyou100.test.vo.Dept;

@Service(value="msg")
public class MessageServiceImpl implements IMessageService {

	@Override
	public String getInfo() {
		return "www.baidu.com";
	}

	@Override
	public boolean delete(String mid) {
		Logger.getLogger(MessageServiceImpl.class).info("业务层执行删除操作，当前删除的mid是：" + mid);
//		Dept dept = null;
//		dept.getDeptno();
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		Logger.getLogger(MessageServiceImpl.class).info("业务层执行login操作，当前username是：" + username + ", 密码是：" + password);
		return false;
	}
	
	

}
