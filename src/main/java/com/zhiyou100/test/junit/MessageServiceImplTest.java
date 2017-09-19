package com.zhiyou100.test.junit;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.test.service.IMessageService;
import com.zhiyou100.test.vo.Dept;
import com.zhiyou100.test.vo.Emp;

import junit.framework.TestCase;

public class MessageServiceImplTest {
	private static ApplicationContext ctx = null;
	static {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testGetInfo() {
		IMessageService service = ctx.getBean("msg", IMessageService.class);
		Logger.getLogger(MessageServiceImplTest.class).info(service.delete("110"));
		Logger.getLogger(MessageServiceImplTest.class).info(service.login("张三", "123456"));
//		Logger.getLogger(MessageServiceImplTest.class).info(service.getInfo());
		
//		IMessageService service = ctx.getBean("msgBean", IMessageService.class);
//		Logger.getLogger(MessageServiceImplTest.class).info(service.getInfo());
//		TestCase.assertEquals("www.baidu.com", service.getInfo());
		
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept", Dept.class));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept2", Dept.class));
//		
//		Logger.getLogger(Emp.class).info(ctx.getBean("emp", Emp.class));
//		Logger.getLogger(Emp.class).info(ctx.getBean("emp2", Emp.class));
//		
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept4", Dept.class));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept5", Dept.class));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept6", Dept.class));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept7", Dept.class));

//		Logger.getLogger(Dept.class).info(ctx.getBean("dept"));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept2"));
//		
//		Logger.getLogger(Emp.class).info(ctx.getBean("emp"));
//		Logger.getLogger(Emp.class).info(ctx.getBean("emp2"));
//		
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept4"));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept5"));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept6"));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept7"));
//		Logger.getLogger(Dept.class).info(ctx.getBean("dept8"));
	}

}
