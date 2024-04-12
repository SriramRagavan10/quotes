package com.vid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Video {

	@GetMapping(value = "/get")
	public String get() {
		return "vid.html";
	}

}
