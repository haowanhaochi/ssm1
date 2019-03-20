package com.neu.ssm1.mapper;

import com.neu.ssm1.pojo.Dept;

public interface DeptMapper {
	public void deleteDept(Integer dno);
	public Dept queryDept(Integer dno);
}
