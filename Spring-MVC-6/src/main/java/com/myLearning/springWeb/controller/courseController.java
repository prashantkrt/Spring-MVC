package com.myLearning.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myLearning.springWeb.pojo.Course;

@Controller
public class courseController {

	@GetMapping("/courseDetails")
	public String getCourseDetails(Model model) {
		model.addAttribute("id","Java21");
		model.addAttribute("name","Core Java");
		model.addAttribute("price","1999 INR");
		model.addAttribute("duration","2 months");
		return "course"; // Logical view name
	}

	@GetMapping("/courseInfo")
	public String getCourseInfo(Model model) {
		Course course = new Course();
		course.setId(1);
		course.setName("Java J2EE");
		course.setPrice(1999.00);
		course.setDuration("3 months");		
		
		model.addAttribute("course",course);
		return "courseInformation"; // Logical view name
	}
	
	@GetMapping({"/courseInformation","/courseData"})
	public String getCourseData(Model model) {
		Course course = new Course();
		course.setId(1);
		course.setName("Java J2EE");
		course.setPrice(1999.00);
		course.setDuration("3 months");		
		
		model.addAttribute("course",course);
		return "courseInformation"; // Logical view name
	}

}
