package com.myLearning.springWeb.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class PathParamController {
	
	// we use @PathVariable in our controller to receive Path param

	// http://localhost:8085/message/Rajat
	@GetMapping("/message/{name}")
	public String displayMessage(@PathVariable("name") String name, Map<String, Object> model) {
		String message = "Hello  " + name + " I hope you are doing good!!";
		model.put("message", message);
		return "index";
	}
	// http://localhost:8085/getMessage/Rajat/Jabalpur/28
	@GetMapping("/getMessage/{name}/{mycity}/{age}")
	public String displayMessage(@PathVariable("name")String name, @PathVariable("mycity")String city, @PathVariable("age")Integer age,Map<String, Object> model) {
		String message = "Hello  " +name+" from "+city+" having age "+age+" I hope you are doing good!!";
		model.put("message", message);
		return "index";
	}
}
