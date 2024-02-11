package com.myLearning.springWeb.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
	
	// we use @RequestParam in our controller to receive Query param

	// http://localhost:8085/message?name=Rajat
	@GetMapping("/message")
	public String displayMessage(@RequestParam("name") String name, Map<String, Object> model) {
		String message = "Hello  " + name + " I hope you are doing good!!";
		model.put("message", message);
		return "index";
	}
	// http://localhost:8085/getMessage?name=Rajat&city=Jabalpur
	@GetMapping("/getMessage")
	public String displayMessage(@RequestParam("name") String name, @RequestParam("city") String city, Map<String, Object> model) {
		String message = "Hello  " + name + "from "+ city+" I hope you are doing good!!";
		model.put("message", message);
		return "index";
	}
}
