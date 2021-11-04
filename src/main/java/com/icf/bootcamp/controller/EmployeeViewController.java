package com.icf.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class EmployeeViewController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/createemployees")
	public String createEmployee()
	{
		return "createemployees";
	}
	
	@RequestMapping("/getallemployees")
	public String gettingEmployeeList()
	{
		return "getallemployees";
	}
	
	@RequestMapping("/getemployeebyid")
	public String getEmployeeByID() {
		return "getemployeebyid";
	}
	
	@RequestMapping("/getemployeebymanager")
	public String getEmployeeByManager() {
		return "getemployeebymanager";
	}
	
	@RequestMapping("/deleteemployeebyid")
	public String deleteEmployeeByID() {
		return "deleteemployeebyid";
	}
	
	@RequestMapping("/updateemployeebyid")
	public String updateEmployeeByID() {
		return "updateemployeebyid";
	}

}