package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Emp;

public interface IEmpDao {
	
	public List<Department> queryAll();
	
	public List<Emp> queryEmpById(@Param("did") Integer did);
	
	public int deleteEmp(@Param("did") Integer did);
}
