package com.icf.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class DependantViewController {

	@RequestMapping("/getalldependant")
	public String gettingDependantList() {
		return "getalldependant";
	}

	@RequestMapping("/getdependantbyid")
	public String getDependantByID() {
		return "getdependantbyid";
	}
	
	@RequestMapping("/updatedependantbyid")
	public String updateDependantByID() {
		return "updatedependantbyid";
	}
}