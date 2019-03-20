package com.neu.ssm1.pojo;

public class Dept {
	int deptNo;	// 属性名一定要与数据库一致
	String dName;
	String loc;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Dept(int deptNo, String dName, String loc) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

}
