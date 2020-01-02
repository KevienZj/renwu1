package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.EmpBiz;


@SpringBootTest
class RenwuApplicationTests {

	@Autowired
	private EmpBiz biz;
	
	@Test
	public void query() {
	System.out.println(	biz.queryAll());
	}

}
