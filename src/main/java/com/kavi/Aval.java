package com.kavi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Aval {
	
	@GetMapping(value = "/tamil")
	public String get() {
		return "tamil.html";
	}

}
