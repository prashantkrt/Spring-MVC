package com.myLearning.springWeb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import com.myLearning.springWeb.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

//http://localhost:8085/getWish
//http://localhost:8085/getGreeting
//http://localhost:8085/greetApplication/greetings/getWish
//http://localhost:8085/greetApplication/greetings/getGreeting

@Controller
//@RequestMapping("/greetings")
public class GreetingController {

	@Autowired
	IGreetingService service;

	@GetMapping("/getWish")
	public void response(Map<String, Object> model) {
		model.put("greet", service.generateGreeting());
	}

	@GetMapping("/getGreeting")
	public Map<String, Object> showResponse() {
		String greet = service.generateGreeting();
		Map<String, Object> map = new HashMap<>();
		map.put("key1", greet);
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "alue4");
		return map;
	}

	// not recommended, older way
	@GetMapping("/getResponse")
	public void request(HttpServletResponse response) throws IOException {
		String greet = service.generateGreeting();
		PrintWriter writer = response.getWriter();
		writer.println("<h1> hello this is from controller directly "+ greet+" </h1>");
		return;
	}
}
