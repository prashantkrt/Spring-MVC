package com.myLearning.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

	@GetMapping("/department")
	public String message(Model model) {
		model.addAttribute("key", "IT Department");
		return "department"; // Logical View Name
	}
	@GetMapping("/skill")
	public String message2(Model model) {
		model.addAttribute("key", "my message to all");
		return "focus"; // Logical View Name
	}

}
