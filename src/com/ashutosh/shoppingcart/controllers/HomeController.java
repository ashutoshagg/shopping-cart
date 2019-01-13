package com.ashutosh.shoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String viewPage() {
		return "main-menu";
	}

}
