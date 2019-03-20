package com.neu.ssm1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neu.ssm1.pojo.Dept;
import com.neu.ssm1.service.DeptService;

@Controller
public class TestController {
	private DeptService service;
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (DeptService) ac.getBean("deptService");
	}
	
	@RequestMapping("/test")
	public String jumpTest()
	{
		System.out.println("controller: " + service);
		service.delete(3);
		return "show.jsp";
	}
	
	@RequestMapping("/testquery")
	public ModelAndView queryTest(Integer deptno)	// 参数名要与页面中的name属性一致
	{
		System.out.println("queryTest: " + deptno);
		Dept data = service.query(deptno);
		
		ModelAndView mav = new ModelAndView("queryret.jsp");
		mav.addObject("dno", data.getDeptNo());
		mav.addObject("dname", data.getdName());
		mav.addObject("dloc", data.getLoc());
		return mav;
		
	}
}
