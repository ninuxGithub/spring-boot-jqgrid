package com.kevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value={"/", "/index"})
	public String indexPage(){
		System.out.println("index page...");
		return "index";
	}

}
