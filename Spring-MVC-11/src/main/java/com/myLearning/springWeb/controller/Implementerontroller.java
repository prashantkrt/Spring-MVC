package com.myLearning.springWeb.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.myLearning.springWeb.model.Implementers;

@Controller
public class Implementerontroller {

	// http://localhost:8085/Implementers/register
	//control to form default value
	@GetMapping("/register")
	public String responseHome(@ModelAttribute("impl") Implementers impl) {
		return "register";
	}

	//form to controller
	@PostMapping("/register")
	public String registerData(Map<String, Object> model, @ModelAttribute("impl") Implementers impl) {
		
		System.out.println(impl);
		model.put("impl", impl);
		
		return "result";
	}
}
