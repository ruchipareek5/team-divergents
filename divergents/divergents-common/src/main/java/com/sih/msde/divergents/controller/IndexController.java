package com.sih.msde.divergents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String IndexPage()
	{
		return "home";
	}
	@RequestMapping("/index")
	public String Index()
	{
		return "index";
	}
}
