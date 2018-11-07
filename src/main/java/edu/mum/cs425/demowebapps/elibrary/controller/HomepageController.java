package edu.mum.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	
	@RequestMapping(value= {"/","elibrary","elibrary/home"})
	public String displayHomePage() {
		
		return "home/index";
		
	}

}
