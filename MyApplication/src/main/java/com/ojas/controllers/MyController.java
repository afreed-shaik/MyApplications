package com.ojas.controllers;

import java.time.LocalDateTime;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MyController {
	@RequestMapping("/dispDate")
	public String greet(@RequestParam(name = "user", required = false)
	String user, ModelMap model) {
		if(user == null)
			model.put("user", "Guest");
		else
			model.put("user", user);
		
		model.put("now", LocalDateTime.now().toString());
		return "hello";
	}
}
