package com.zhiyou100.test.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.test.service.IMessageService;
import com.zhiyou100.test.vo.Dept;
import com.zhiyou100.test.vo.Emp;

public class TestIMessageService {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IMessageService service = ctx.getBean("msgBean", IMessageService.class);
//		System.out.println(service.getInfo());
		// 通过日志工厂的一种使用方式
		Logger logger = LoggerFactory.getLogger(TestIMessageService.class);
		logger.info(service.getInfo());
		logger.error(service.getInfo());
		logger.warn(service.getInfo());
//		logger.debug(service.getInfo());
		
		Emp emp = new Emp();
		Dept dept = new Dept();
		dept.setDeptno(103);
		dept.setDname("市场部");
		dept.setLoc("深圳");
		emp.setEmpno(9527);
		emp.setEname("明明");
		emp.setSal(10000.0);
		emp.setDept(dept);
		System.out.println(emp.getDept());
		
		
	}

}

