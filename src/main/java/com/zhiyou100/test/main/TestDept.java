package com.zhiyou100.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.test.dao.IDeptDAO;
import com.zhiyou100.test.service.IDeptService;
import com.zhiyou100.test.vo.Dept;

public class TestDept {
	private static ApplicationContext myContext = null;
	static {
		myContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String[] args) {
//		IDeptDAO deptDao = myContext.getBean("deptDao", IDeptDAO.class);
//		System.out.println(deptDao);
		IDeptService deptService = myContext.getBean("deptService", IDeptService.class);
		deptService.add(myContext.getBean("dept8", Dept.class));
		
	}

}
