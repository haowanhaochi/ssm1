package com.neu.ssm1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.ssm1.mapper.DeptMapper;
import com.neu.ssm1.pojo.Dept;

@Service
public class DeptService {
	@Autowired
	private DeptMapper mapper;
	
	public void delete(Integer dno)
	{
		mapper.deleteDept(dno);
	}
	
	public Dept query(Integer dno)
	{
		Dept dept = mapper.queryDept(dno);
		System.out.println("service: " + dept.getDeptNo() + dept.getdName() + dept.getLoc());
		return dept;
	}
}
