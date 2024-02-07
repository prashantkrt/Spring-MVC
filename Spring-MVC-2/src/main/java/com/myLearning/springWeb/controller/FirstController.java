package com.myLearning.springWeb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	// @RequestMapping("/home") // automatically by default to
	// method=RequestMethod.GET
	// @RequestMapping(value = "/home" , method = RequestMethod.GET)
	// @RequestMapping(value = "/home" , method = RequestMethod.POST)
	// @RequestMapping(value = "/home" , method = RequestMethod.PUT)
	// @RequestMapping(value = "/home" , method = RequestMethod.DELETE)
	@GetMapping("/home")
	public String displayMessage(Model model) {
		System.out.println("Model is implemented by " + model.getClass().getName());
		model.addAttribute("name", "Rakesh");	
		return "home"; // Logical View Name
	}

	@PostMapping("/skill")
	public String displayMessage2(Model model) {
		System.out.println("Model is implemented by " + model.getClass().getName());
		model.addAttribute("name", "Rakesh");
		return "skill"; // Logical View Name
	}

	@GetMapping("/index")
	public String messages(Map<String, Object> model) {
		model.put("Name", "Kumar");
		model.put("Skill", "Java");
		model.put("Department", "Software Development");
		return "index";
	}
	
	@GetMapping("/info") // by default it will give info.jsp logical view name
	public void info(HashMap<String, Object> model) {
		model.put("Name", "Vinod");
		model.put("Skill", "HTML");
		model.put("Department", "FrontEnd Development");		
	}
	
	// more shorter , no need to add extra paramter
	// by default it will give info.jsp logical view name
	// important : condition this is possible if have only one method in single controller
	@GetMapping	
	public void view() {
		ModelAndView model = new ModelAndView();
		model.addObject("Name", "Vinod");
		model.addObject("Skill", "HTML");
		model.addObject("Department", "FrontEnd Development");	
		Map<String,Object> map = new HashMap<>();
		map.put("company", "XYZ");
		model.addAllObjects(map);
		model.setViewName("view");		
	}
}
