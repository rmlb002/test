package com.zhiyou100.test.dao.impl;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.zhiyou100.test.dao.IDeptDAO;
import com.zhiyou100.test.vo.Dept;

// 代表将DeptDAOImpl这个bean自动注入到spring容器中
@Repository(value="deptDAOImpl")
public class DeptDAOImpl implements IDeptDAO {

	@Override
	public boolean doCreate(Dept vo) {
		LoggerFactory.getLogger(DeptDAOImpl.class).info(vo.toString());
		return true;
	}

}
