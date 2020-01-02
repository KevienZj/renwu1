package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IEmpDao;
import com.accp.pojo.Department;
import com.accp.pojo.Emp;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpBiz {

	@Autowired
	private IEmpDao dao;
	
	public List<Department> queryAll(){
		return dao.queryAll();
	}
	
	public List<Emp> queryEmpById(Integer did){
		return dao.queryEmpById(did);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public boolean deleteEmp(Integer did) {
		return dao.deleteEmp(did)>0;
	}
}
