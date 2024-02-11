package com.myLearning.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/response")
	public String showResponse(Model model) {
		String[] obj = new String[] { "book", "Java", "Spring" };	
		model.addAttribute("books", obj);
		return "response";
	}
}
