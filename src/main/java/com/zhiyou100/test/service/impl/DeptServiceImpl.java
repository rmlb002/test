package com.zhiyou100.test.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.test.dao.IDeptDAO;
import com.zhiyou100.test.dao.impl.DeptDAOImpl;
import com.zhiyou100.test.service.IDeptService;
import com.zhiyou100.test.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {

	//@Resource
//	@Autowired
	@Resource
	private IDeptDAO dao; //= new DeptDAOImpl();  // @Resource   new DeptDAOImpl();
	
//	public void setDao(IDeptDAO dao) {
//		this.dao = dao;
//	}


	@Override
	public boolean add(Dept vo) {
		return dao.doCreate(vo);
	}

}
