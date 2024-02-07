package com.myLearning.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class MyFirstController {

	@RequestMapping(value = "/{welcome}")   
	public ModelAndView displayMessage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "my first MVC controller");//model -> data
		mv.setViewName("index"); // View -> Logical View Name
		return mv;
	}
	
	@RequestMapping(value = "/home")   
	public ModelAndView displayMessage2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Spring MVC");//model -> data
		mv.setViewName("index"); // View -> Logical View Name
		return mv;
	}
}
