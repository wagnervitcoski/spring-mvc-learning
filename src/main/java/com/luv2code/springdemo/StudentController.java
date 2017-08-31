package com.luv2code.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		Student s=new Student();
		model.addAttribute("student",s);
		model.addAttribute("countries",countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processform(@ModelAttribute("student") Student student){
				
		return "student-confirmation";
	}
	
}
