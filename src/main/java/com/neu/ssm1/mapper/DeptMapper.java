package com.neu.ssm1.mapper;

import java.util.List;

import com.neu.ssm1.pojo.Dept;

public interface DeptMapper {
	public void deleteDept(Integer dno);
	public Dept queryDept(Integer dno);
	public List<Dept> queryDepts();
}
