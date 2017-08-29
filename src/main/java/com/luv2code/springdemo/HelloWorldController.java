package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		
		String name = request.getParameter("studentName");
		model.addAttribute("message","Yo! "+name.toUpperCase());
		
		return "helloWorld";
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworkd-form";
	}
	
	
}
