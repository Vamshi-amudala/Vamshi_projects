package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@GetMapping("/msg")
	public ModelAndView getMessage() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("msg", "Welcome to Spring web mvc");
		mv.setViewName("display");
		return mv;
	}
}