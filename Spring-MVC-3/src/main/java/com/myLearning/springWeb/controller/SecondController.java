package com.myLearning.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller2") //http://localhost:8085/controller2/skill
public class SecondController {

	@GetMapping("/department")
	public String message(Model model) {
		model.addAttribute("key", "IT Department");
		return "department"; // Logical View Name
	}
	// no exception since it's in diff reqMapping
	@GetMapping("/skill")
	public String message2(Model model) {
		model.addAttribute("key", "my message to all");
		return "focus"; // Logical View Name
	}

}
