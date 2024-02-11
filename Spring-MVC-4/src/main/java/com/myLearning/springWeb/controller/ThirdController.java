package com.myLearning.springWeb.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/controller1")
public class ThirdController {

	@GetMapping("/index")
	public String displayMessage(Map<String, Object> model) {
		model.put("message", "Context path application");	
		return "index";
	}
}
