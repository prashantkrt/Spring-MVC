package com.myLearning.springWeb.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.myLearning.springWeb.model.Implementers;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Implementerontroller {

	// http://localhost:8085/Implementers/register
	@GetMapping("/register")
	public String responseHome() {
		return "register";
	}

	// not needed this much
	/*
	 * @PostMapping("/register") public String registerData(Map<String, Object>
	 * model, HttpServletRequest request) {
	 * 
	 * Integer id = Integer.parseInt(request.getParameter("id")); String name =
	 * request.getParameter("name"); Integer age =
	 * Integer.parseInt(request.getParameter("age")); String gender =
	 * request.getParameter("gender"); String city = request.getParameter("city");
	 * Double salary = Double.parseDouble(request.getParameter("salary"));
	 * 
	 * blaa blaa.. and soo on..
	 * 
	 * return null; }
	 */

	@PostMapping("/register")
	public String registerData(Map<String, Object> model, @ModelAttribute("impl") Implementers impl) {
		
		System.out.println(impl);
		model.put("impl", impl);
		
		return "result";
	}
}
