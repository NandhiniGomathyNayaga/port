package com.example.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class RestController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
