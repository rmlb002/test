package com.zhiyou100.test.proxy;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProxyService {

	@Before(value="execution(* com.zhiyou100..service..*.*(..)) and args(username, password)", argNames="username, password")
	public void beforeMsgDelete(Object arg1, Object arg2) {
		Logger.getLogger(ProxyService.class).info("Message业务处理之前执行的操作..." + arg1 + "参数2：" + arg2);
	}
	
	@After(value="execution(* com.zhiyou100..service..*.*(..))")
	public void afterMsgDelete() {
		Logger.getLogger(ProxyService.class).info("Message业务处理之后执行的操作...");
	}
	
	@AfterReturning(value="execution(* com.zhiyou100..service..*.*(..))", returning="w", argNames="w")
	public void returnInvoke(Object val) {
		Logger.getLogger(ProxyService.class).info("Message业务处理后返回的操作..., 返回值为：" + val);
	}
	
	@AfterThrowing(value="execution(* com.zhiyou100..service..*.*(..))", throwing="e", argNames="e")
	public void throwInvoke(Exception e) {
		Logger.getLogger(ProxyService.class).info("Message业务处理抛出异常处理，异常为：" + e);
	}
	
//	@Around(value="execution(* com.zhiyou100..service..*.*(..))")
//	public Object aroundInvoke(ProceedingJoinPoint point) throws Throwable {
//		Logger.getLogger(ProxyService.class).info("Before处理..." + Arrays.toString(point.getArgs()));
//		Object[] obj = new Object[]{"zhiyoujava"};
////		Object obj = point.proceed(new String[]{"zhiyoujava"});  // 调用业务方法
//		Logger.getLogger(ProxyService.class).info("After处理..." + obj);
//		return true;
//	}
}
