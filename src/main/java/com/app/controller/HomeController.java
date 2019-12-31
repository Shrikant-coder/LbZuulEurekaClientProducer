package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
@RestController
public class HomeController {

	@RequestMapping(value = "/producer/getAlldata",method = RequestMethod.GET)
	//@RequestMapping(value = "/getAlldata",method = RequestMethod.GET)

	public List getAlldata()
	{
		Student stu=new Student();
		stu.setRoll(101);
		stu.setName("shrikant From 8083");
		stu.setAddr("satara");
		
		Student stu1=new Student();
		stu1.setRoll(102);
		stu1.setName("Omkar");
		stu1.setAddr("pune");
		
		List<Student>stulist=new ArrayList<Student>();
		stulist.add(stu);
		stulist.add(stu1);
		return stulist;
	}

}
